package com.n.spring.hibernate.lessons.dao.impl;
import com.n.spring.hibernate.lessons.dao.UserDAO;
import com.n.spring.hibernate.lessons.factory.Factory;
import com.n.spring.hibernate.lessons.model.Role;
import com.n.spring.hibernate.lessons.model.User;
import com.n.spring.hibernate.lessons.util.HibernateUtil;
import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class UserDAOImpl implements UserDAO{
	
	
	private SessionFactory sessionFactory;

	@Override
	public void addUser(User user) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			System.out.println("User was added successfully");
			Role role = new Role(user.getEmail(), "ROLE_USER");
			Factory.getInstance().getRoleDAO().addRole(role);
		} catch (Exception e) {
			System.out.println("Error add  "  + e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	@Override
	public void updateUser(String email, User user) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(user);
			session.getTransaction().commit();
			System.out.println("User was updated successfully");
		} catch (Exception e) {
			System.out.println("Error update  "  + e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	@Override
	public User getUserByEmail(String email) throws SQLException {
		Session session = null;
		User user = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			user = (User) session.load(User.class, email);
		} catch (Exception e) {
			System.out.println("Error get user by email  "  + e.getMessage());
		} 
		return user;
	}


	@Override
	public ArrayList<User> getAllUsers() throws SQLException {
		Session session = null;
		ArrayList<User> users = new ArrayList<User>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			users = (ArrayList<User>) session.createCriteria(User.class).list();
		} catch (Exception e) {
			System.out.println("Error get all users  "  + e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return users;
	}

	@Override
	public void deleteUser(User user) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(user);
			session.getTransaction().commit();
			Role role = Factory.getInstance().getRoleDAO().getRoleByEmail(user.getEmail());
			Factory.getInstance().getRoleDAO().deleteRole(role);
			System.out.println("User was deleted successfully");
		} catch (Exception e) {
			System.out.println("Error delete user "  + e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public boolean isUnique(User user) {
		Session session = null;
		session = HibernateUtil.getSessionFactory().openSession();
		String sql = "SELECT * FROM users WHERE email = :user_email";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(User.class);
		query.setParameter("user_email", user.getEmail());
		ArrayList<User> result = (ArrayList<User>) query.list();
		if(result.size()==0) {
			return true;
		} else 
			return false;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
