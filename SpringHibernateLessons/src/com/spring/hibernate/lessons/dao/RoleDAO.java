package com.n.spring.hibernate.lessons.dao;
import java.sql.SQLException;
import java.util.Collection;
import com.n.spring.hibernate.lessons.model.*;

public interface RoleDAO {

	public void addRole(Role role) throws SQLException;
	public void updateRole(String email, Role role) throws SQLException;
	public Role getRoleByEmail(String email) throws SQLException;
	public Collection<Role> getAllRoles() throws SQLException;
	public void deleteRole(Role role) throws SQLException;
}
