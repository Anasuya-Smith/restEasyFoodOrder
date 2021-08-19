package com.myProject.restEasyFoodOrder.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {
	
	private Integer vendorID;
	private String vendorName;
	private String dishName;
	private float vendorDishPrice;
	
	// Super constructor
	public Vendor() {
	}
	
	// Constructor
	public Vendor(Integer vendorID, String vendorName, String dishName, float vendorDishPrice) {
		super();
		this.vendorID = vendorID;
		this.vendorName = vendorName;
		this.dishName = dishName;
		this.vendorDishPrice = vendorDishPrice;
	}

	// Getter and Setter methods
	
	@Id
	public Integer getVendorID() {
		return vendorID;
	}

	public void setVendorID(Integer vendorID) {
		this.vendorID = vendorID;
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

	public float getVendorDishPrice() {
		return vendorDishPrice;
	}

	public void setVendorDishPrice(float vendorDishPrice) {
		this.vendorDishPrice = vendorDishPrice;
	}
	
	
}
