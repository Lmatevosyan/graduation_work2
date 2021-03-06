package com.n.spring.hibernate.lessons.dao.impl;
import com.n.spring.hibernate.lessons.dao.RoleDAO;
import com.n.spring.hibernate.lessons.model.Role;
import com.n.spring.hibernate.lessons.util.HibernateUtil;
import java.sql.SQLException;
import java.util.Collection;
import java.util.ArrayList;
import org.hibernate.Session;

public class RoleDAOImpl implements RoleDAO{

	@Override
	public void addRole(Role role) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(role);
			session.getTransaction().commit();
			System.out.println("Role was added successfully");
		} catch (Exception e) {
			System.out.println("Error add role  "  + e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	@Override
	public void updateRole(String email, Role role) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(role);
			session.getTransaction().commit();
			System.out.println("Role was updated successfully");
		} catch (Exception e) {
			System.out.println("Error update role  "  + e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	@Override
	public Role getRoleByEmail(String email) throws SQLException {
		Session session = null;
		Role role = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			role = (Role) session.load(Role.class, email);
		} catch (Exception e) {
			System.out.println("Error find by email role  "  + e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return role;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Role> getAllRoles() throws SQLException {
		Session session = null;
		ArrayList<Role> roles = new ArrayList<Role>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			roles = (ArrayList<Role>) session.createCriteria(Role.class).list();
		} catch (Exception e) {
			System.out.println("Error get all roles  "  + e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return roles;
	}

	@Override
	public void deleteRole(Role role) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(role);
			session.getTransaction().commit();
			System.out.println("Role was deleted successfully");
		} catch (Exception e) {
			System.out.println("Error delete role  "  + e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
} 
