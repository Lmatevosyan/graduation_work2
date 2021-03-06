package com.n.spring.hibernate.lessons.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.switchuser.SwitchUserGrantedAuthority;
import com.n.spring.hibernate.lessons.dao.UserDAO;
import com.n.spring.hibernate.lessons.model.Role;
 
public class MyUserDetailsService implements UserDetailsService {
 
	private UserDAO userDao;
 
	@Override
	public UserDetails loadUserByUsername(final String email) 
               throws UsernameNotFoundException {
 
		com.n.spring.hibernate.lessons.model.User user = null;
		try {
			user = userDao.getUserByEmail(email);
		}  catch (SQLException e) {
			e.printStackTrace();
		}
		List<GrantedAuthority> authorities = buildUserAuthority(user.getUserRole());
		return buildUserForAuthentication(user, authorities);
	}
 
	private User buildUserForAuthentication(com.n.spring.hibernate.lessons.model.User user, 
		List<GrantedAuthority> authorities) {
		return new User(user.getEmail(), 
			user.getPassword(), user.isEnabled(), 
                        true, true, true, authorities);
	}
 
	private List<GrantedAuthority> buildUserAuthority(Set<Role> userRoles) {
 
		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
		// Build user's authorities
		for (Role userRole : userRoles) {
			setAuths.add(new SwitchUserGrantedAuthority(userRole.getRole(), null));
		}
		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);
		return Result;
	}
 
	public UserDAO getUserDao() {
		return userDao;
	}
 
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
}
