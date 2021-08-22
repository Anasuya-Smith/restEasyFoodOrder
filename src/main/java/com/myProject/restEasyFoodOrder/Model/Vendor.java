package com.myProject.restEasyFoodOrder.Model;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Reference;



@Entity
public class Vendor {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@JoinColumn(name = "vendorid")
    //private Admin user;
	//@OneToOne(mappedBy = "users")
	@JoinColumn(name = "vendorid")
	private Integer vendorID;
	
	//@OneToOne(mappedBy = "users")
	@Column(name = "vendor_name")
	private String vendorName;
	
	@Column(name = "dish_name")
	private String dishName;
	
	@Column(name = "dish_cal")
	private float dishCal;
	
	@Column(name = "vendor_dish_price")
	private float vendorDishPrice;
/*	
	@OneToOne(mappedBy = "vendor")
	private Admin users;
*/	
	// Super constructor
	public Vendor() {
	}
	
	// Constructor
	public Vendor(Integer vendorID, String vendorName, String dishName, float dishCal, float vendorDishPrice) {
		
		this.vendorID = vendorID;
		this.vendorName = vendorName;
		this.dishName = dishName;
		this.dishCal = dishCal;
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
	
	public float getDishCal() {
		return dishCal;
	}

	public void setDishCal(float dishCal) {
		this.dishCal = dishCal;
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
                ", dishCal='" + dishCal + '\'' +
                ", dishPrice='" + vendorDishPrice + '\'' +
                '}';
    }

	public Integer getId() {
		// TODO Auto-generated method stub
		return getVendorID();
	}
	
}
