package com.myProject.restEasyFoodOrder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	private Integer id;
	private Boolean vendor;
	private String userName;
	private String password;
	
	// Super constructor
	public Admin() {
	}
	
	// Constructor with fields
	public Admin(Integer id, Boolean vendor, String userName, String password) {
		
		this.id = id;
		this.vendor = vendor;
		this.userName = userName;
		this.password = password;
	}

	// Getter and Setter functions to access the private values
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getVendor() {
		return vendor;
	}

	public void setVendor(Boolean vendor) {
		this.vendor = vendor;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
