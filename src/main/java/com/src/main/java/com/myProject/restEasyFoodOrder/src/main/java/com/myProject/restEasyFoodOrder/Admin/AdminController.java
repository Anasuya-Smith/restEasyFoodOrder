package com.myProject.restEasyFoodOrder.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myProject.restEasyFoodOrder.Customer.CustomerService;
import com.myProject.restEasyFoodOrder.Customer.custOrder;


@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/Admin")
	public List<custOrder> list() {
		return customerService.listAllOrders();
	}
	
	
	
	

}
