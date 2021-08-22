package com.myProject.restEasyFoodOrder.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.web.servlet.function.ServerResponse;

@Entity
@DynamicUpdate
@Table(name = "users", schema = "mydb")
/*
@NamedQueries(
		{
			@NamedQuery(name = "displayByUserName", query = "select u from Admin u where u.userName = :userName"),
			@NamedQuery(name = "deleteByUserName", query = "delete from Admin u where u.userName = :userName"),
			@NamedQuery(name = "displayByUserID", query = "select u from Admin u where u.id = :userID"),
			@NamedQuery(name = "deleteByUserID", query = "delete from Admin u where u.id = :userID"),
			@NamedQuery(name = "updateUserName", query = "update Admin u set u.userName = :userName where u.id = :userID"),
			@NamedQuery(name = "updatePassword", query = "update Admin u set u.password = :password where u.id = :userID"),
		}
		)
*/
public class Admin {
	
	@Id
	@Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "vendor")
	private Boolean isVendor;
	
	@Column(name = "customer")
	private Boolean isCustomer;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	// Setting up the foreign keys
/*	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "vendorid", referencedColumnName = "id")
	private Vendor vendor;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id", referencedColumnName = "id")
	private Orders orders;
*/	
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
		return "Admin [id=" + id + ", isVendor=" + isVendor + ", isCustomer=" + isCustomer + ", userName=" + userName
				+ ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isCustomer == null) ? 0 : isCustomer.hashCode());
		result = prime * result + ((isVendor == null) ? 0 : isVendor.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isCustomer == null) {
			if (other.isCustomer != null)
				return false;
		} else if (!isCustomer.equals(other.isCustomer))
			return false;
		if (isVendor == null) {
			if (other.isVendor != null)
				return false;
		} else if (!isVendor.equals(other.isVendor))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
}
