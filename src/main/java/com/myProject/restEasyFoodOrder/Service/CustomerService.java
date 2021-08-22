package com.myProject.restEasyFoodOrder.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.restEasyFoodOrder.Common.Exception.OrderException;
import com.myProject.restEasyFoodOrder.Dao.OrdersDao;
import com.myProject.restEasyFoodOrder.Model.Dishes;
import com.myProject.restEasyFoodOrder.Model.Orders;
import com.myProject.restEasyFoodOrder.Model.Orders;
import com.myProject.restEasyFoodOrder.Repository.CustomerRepository;
import com.myProject.restEasyFoodOrder.Repository.DishesRepository;
import com.myProject.restEasyFoodOrder.Repository.UserRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private DishesRepository dishesRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	//@Autowired
	//private OrdersDao ordersDao;

	public List<Orders> listAllOrders() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	public List<Dishes> listAllDishes() {
		// TODO Auto-generated method stub
		return dishesRepo.findAll();
	}

	public Orders save(Orders orderDetail) throws OrderException {
		// TODO Auto-generated method stub
		//OrdersDao ordersDao = new OrdersDao();
		//return ordersDao.createOrder(orderDetail);
		//Orders newOrder = customerRepo.save(orderDetail);
		
		return customerRepo.save(orderDetail);
	}
	
	
	public Orders getOrder(Integer orderID) {
		return customerRepo.findById(orderID).orElseGet(Orders::new);
	}
	
	

}
