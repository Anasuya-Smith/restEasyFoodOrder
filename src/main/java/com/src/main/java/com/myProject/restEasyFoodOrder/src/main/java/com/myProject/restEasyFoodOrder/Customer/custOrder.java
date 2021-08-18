package com.myProject.restEasyFoodOrder.Customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class custOrder {
	
	private Integer orderID;
	private Integer dishID;
	private String vendorName;
	private String dishName;
	private float dishPrice;
	private Integer custOrderQuantity;
	private float custOrderTotal;
	
	// Super constructor
	public custOrder() {
	}

	// Constructor
	public custOrder(Integer orderID, Integer dishID, String vendorName, String dishName, float dishPrice,
			Integer custOrderQuantity, float custOrderTotal) {
		super();
		this.orderID = orderID;
		this.dishID = dishID;
		this.vendorName = vendorName;
		this.dishName = dishName;
		this.dishPrice = dishPrice;
		this.custOrderQuantity = custOrderQuantity;
		this.custOrderTotal = custOrderTotal;
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

	public float getCustOrderTotal() {
		return custOrderTotal;
	}

	public void setCustOrderTotal(float custOrderTotal) {
		this.custOrderTotal = custOrderTotal;
	}
	
}
