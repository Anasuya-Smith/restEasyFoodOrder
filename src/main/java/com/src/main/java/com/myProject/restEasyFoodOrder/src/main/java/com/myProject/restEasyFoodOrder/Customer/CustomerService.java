package com.myProject.restEasyFoodOrder.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private UserRepository userRepo;

	public List<custOrder> listAllOrders() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}
	
	

}
