package com.myProject.restEasyFoodOrder.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.restEasyFoodOrder.Model.Dishes;
import com.myProject.restEasyFoodOrder.Model.Order;
import com.myProject.restEasyFoodOrder.Repository.CustomerRepository;
import com.myProject.restEasyFoodOrder.Repository.DishesRepository;
import com.myProject.restEasyFoodOrder.Repository.UserRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private DishesRepository dishesRepo;


	public List<Order> listAllOrders() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}
	
	public Dishes getDish(String dishName) {
		return dishesRepo.getById(dishName);
	}
	
	

}
