package com.myProject.restEasyFoodOrder.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
	
	private Integer orderID;
	private Date orderDate;
	private Integer dishID;
	private String vendorName;
	private String dishName;
	private float dishPrice;
	private Integer custOrderQuantity;
	private float orderAmount;
	
	// Super constructor
	public Order() {
	}

	// Constructor
	public Order(Integer orderID, Date orderDate, Integer dishID, String vendorName, String dishName, float dishPrice,
			Integer custOrderQuantity, float orderAmount) {
		
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.dishID = dishID;
		this.vendorName = vendorName;
		this.dishName = dishName;
		this.dishPrice = dishPrice;
		this.custOrderQuantity = custOrderQuantity;
		this.orderAmount = orderAmount;
	}

	// Getter and Setter methods
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getDishID() {
		return dishID;
	}

	public void setDishID(Integer dishID) {
		this.dishID = dishID;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public float getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(float dishPrice) {
		this.dishPrice = dishPrice;
	}

	public Integer getCustOrderQuantity() {
		return custOrderQuantity;
	}

	public void setCustOrderQuantity(Integer custOrderQuantity) {
		this.custOrderQuantity = custOrderQuantity;
	}

	public float getorderAmount() {
		return orderAmount;
	}

	public void setorderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}
	
}
