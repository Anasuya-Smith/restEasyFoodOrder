package com.myProject.restEasyFoodOrder.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dishes {
	
	private Integer dishID;
	private String dishName;
	private float dishCal;
	
	// Super constructor
	public Dishes() {
	}
	
	// Constructor
	public Dishes(Integer dishID, String dishName, float dishCal) {
		super();
		this.dishID = dishID;
		this.dishName = dishName;
		this.dishCal = dishCal;
	}

	// Getter and Setter functions
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getDishID() {
		return dishID;
	}

	public void setDishID(Integer dishID) {
		this.dishID = dishID;
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
	
	
}
