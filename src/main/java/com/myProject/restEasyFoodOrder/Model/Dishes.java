package com.myProject.restEasyFoodOrder.Model;

import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "dishes", schema = "mydb")
/*
@NamedQueries(
		{
			@NamedQuery(name = "displayDishes", query = "select u from Dishes u where u.dishName = :dishName"),
			@NamedQuery(name = "deleteBydishName", query = "delete from Dishes u where u.dishName = :dishName")
			}
		)
*/
public class Dishes {
	
	@Column(name = "dishid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dishID;
	
	@Id
	@Column(name = "dish_name")
	private String dishName;
	
	@Column(name = "dish_cal")
	private float dishCal;
/*	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "dish_name", referencedColumnName = "dish_name")
	private List<Orders> orders;
*/	
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
	
	@Override
	public String toString() {
		return "Dishes{" +
				"dishID = " + dishID + 
				"dishName = " + dishName + '\'' +
				"dishCal = " + dishCal + '\'' +
				"}";
				
	}
	
	
}
