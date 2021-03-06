package com.n.spring.hibernate.lessons.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "users")
public class User {

	@NotBlank
	@Size(min=2, max=30)
	@Column(name = "firstName", length = 30, nullable = false)
	private String firstName;

	@NotBlank
	@Size(min=2, max=30)
	@Column(name = "lastName", length = 30, nullable = false)
	private String lastName;

	@NotBlank
	@Email 
	@Id
	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@Min(1)
	@Max(110)
	@Column(name = "age", nullable = false)
	private String age;

	@NotBlank
	//@Pattern(regexp="[0-9a-zA-Z!@#$%&'*+/=?^_`.~]{4,30}", message="Illegal password. Password can contain letters, numbers and symbols (!@#$%&'*+/=?^_`.~).")
	@Size(min=4, max=100)
	@Column(name = "password", length = 100, nullable = false)
	private String password;
	
	@Column(name = "mark", nullable = false)
	private double mark;

	@Column(name = "enabled", nullable = false)
	private String enabled;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")  
	private Set<Role> role = new HashSet<Role>(0);  

	//private Collection<GrantedAuthority> authorities;

	//@OneToOne(cascade = CascadeType.ALL)
	//  @JoinColumn(name="user_role")
	//private Role role;  

	public User() {
		firstName = null;
		lastName = null;
		email = null;
		age = null;
		password = null;
		mark = 0;
		enabled = "1";
	}
	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getFirstName() { 
		return firstName;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge() {
		return age;
	}

	public void setPassword (String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
	
	public void setMark(double mark) {
		this.mark = mark;
	}

	public double getMark() {
		return mark;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getEnabled() { 
		return enabled;
	}

	public Set<Role> getUserRole() {  
		return role;  
	}  

	public void setUserRole(Set<Role> role) {  
		this.role = role;  
	}  

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public boolean isEnabled() {
		return true;
	}
}
