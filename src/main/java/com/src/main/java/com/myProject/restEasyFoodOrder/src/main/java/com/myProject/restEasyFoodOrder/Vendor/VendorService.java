package com.myProject.restEasyFoodOrder.Vendor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.restEasyFoodOrder.Customer.CustomerRepository;

@Service
public class VendorService {
	
	@Autowired
	private VendorRepository vendorRepo;
	
	@Autowired
	private DishesRepository dishesRepo;
	
	public List<Vendor> listAll() {
		return vendorRepo.findAll();
	}
	

}
