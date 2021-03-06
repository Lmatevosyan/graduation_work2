package com.n.spring.hibernate.lessons.dao;
import java.sql.SQLException;
import java.util.Collection;
import com.n.spring.hibernate.lessons.model.*;

public interface UserDAO {

	public void addUser(User user) throws SQLException;
	public void updateUser(String email, User user) throws SQLException;
	public User getUserByEmail(String email) throws SQLException;
	public Collection<User> getAllUsers() throws SQLException;
	public void deleteUser(User user) throws SQLException;
	public boolean isUnique(User user);
}
