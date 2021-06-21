package com.example.SpringSecurityCheck.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity(name = "user_details")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	int userID;
	@Column(name = "user_name")
	String userName;
	
	@Column(name = "user_name")
	String userPassword;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_roles_connector", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	List<Role> userRoles;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Role> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<Role> userRoles) {
		this.userRoles = userRoles;
	}

	public User(int userID, String userName, List<Role> userRoles) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userRoles = userRoles;
	}
	
	

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userRoles=" + userRoles + "]";
	}

	
}
