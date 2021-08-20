package com.myProject.restEasyFoodOrder.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.web.servlet.function.ServerResponse;

@Entity
@DynamicUpdate
@Table(name = "users")
public class Admin {
	
	@Id
	@Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "vendor")
	private Boolean isVendor;
	
	@Column(name = "customer")
	private Boolean isCustomer;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	// Super constructor
	public Admin() {
	}
	
	// Constructor with fields
	public Admin(Integer id, Boolean isVendor, Boolean isCustomer, String userName, String password) {
		
		this.id = id;
		this.isVendor = isVendor;
		this.isCustomer = isCustomer;
		this.userName = userName;
		this.password = password;
	}

	// Getter and Setter functions to access the private values
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getVendor() {
		return isVendor;
	}

	public void setVendor(Boolean vendor) {
		this.isVendor = vendor;
	}
	
	public Boolean getCustomer() {
		return isCustomer;
	}
	
	public void setCustomer(Boolean customer) {
		this.isCustomer = customer;
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
	
	@Override
	public String toString() {
		return "Users{" +
                "id=" + id +
                ", isVendor=" + isVendor + '\'' +
                ", isCustomer=" + isCustomer + '\'' +
                ", userName=" + userName + '\'' +
                ", password=" + password + '\'' +
                '}';
	}
	
/*
	public Admin id(Integer id2) {
		// TODO Auto-generated method stub
		return ;
	}*/

}
