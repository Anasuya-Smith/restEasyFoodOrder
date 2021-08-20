package com.myProject.restEasyFoodOrder.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vendorid")
	private Integer vendorID;
	
	@Column(name = "vendor_name")
	private String vendorName;
	
	@Column(name = "dish_name")
	private String dishName;
	
	@Column(name = "vendor_dish_price")
	private float vendorDishPrice;
	
	// Super constructor
	public Vendor() {
	}
	
	// Constructor
	public Vendor(Integer vendorID, String vendorName, String dishName, float vendorDishPrice) {
		
		this.vendorID = vendorID;
		this.vendorName = vendorName;
		this.dishName = dishName;
		this.vendorDishPrice = vendorDishPrice;
	}

	// Getter and Setter methods
	
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
	
	@Override
    public String toString() {
        return "Vendor{" +
                "vendorId=" + vendorID +
                ", vendorName='" + vendorName + '\'' +
                ", dishName='" + dishName + '\'' +
                ", dishPrice='" + vendorDishPrice + '\'' +
                '}';
    }
	
}
