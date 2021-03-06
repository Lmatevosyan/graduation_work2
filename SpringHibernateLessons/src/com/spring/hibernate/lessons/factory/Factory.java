package com.n.spring.hibernate.lessons.factory;
import com.n.spring.hibernate.lessons.dao.RoleDAO;
import com.n.spring.hibernate.lessons.dao.UserDAO;
import com.n.spring.hibernate.lessons.dao.impl.RoleDAOImpl;
import com.n.spring.hibernate.lessons.dao.impl.UserDAOImpl;

public class Factory {

	private static UserDAO userDAO = null;
	private static RoleDAO roleDAO = null;
	private static Factory instance = null;

	public static synchronized Factory getInstance(){
		if (instance == null){
			instance = new Factory();
		}
		return instance;
	}
	
	public UserDAO getUserDAO(){
		if (userDAO == null){
			userDAO = new UserDAOImpl();
		}
		return userDAO;
	}

	public RoleDAO getRoleDAO(){
		if (roleDAO == null){
			roleDAO = new RoleDAOImpl();
		}
		return roleDAO;
	}

}
