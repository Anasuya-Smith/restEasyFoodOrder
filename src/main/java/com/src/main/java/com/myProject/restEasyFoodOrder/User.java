package com.myProject.restEasyFoodOrder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	private Integer userID;
	private String userName;
	private Integer userMobile;
	private String userEmail;
	private String userPassword;
	
	
	// Super constructor
	public User() {
	}

	// Constructor 
	public User(Integer userID, String userName, Integer userMobile, String userEmail, String userPassword) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userMobile = userMobile;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}

	// Getter and Setter functions
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(Integer userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
