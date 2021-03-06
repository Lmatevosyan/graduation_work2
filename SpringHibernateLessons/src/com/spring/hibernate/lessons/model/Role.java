package com.n.spring.hibernate.lessons.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "user_roles")
public class Role {

	@Id
	@Column(name = "email", length=45, nullable = false)
	private String email;
	@Column(name = "ROLE", length=45, nullable = false)
	private String role;

	@ManyToOne(fetch = FetchType.LAZY)  
	@JoinColumn(name = "email", nullable = false, insertable = false, updatable = false)  
	private User user;  

	public Role() {
		email = null;
		role = null;
	}

	public Role(String email, String role) {
		this.email = email;
		this.role = role;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public User getUser() {  
		return user;  
	}  

	public void setUser(User user) {  
		this.user = user;  
	}  
}
