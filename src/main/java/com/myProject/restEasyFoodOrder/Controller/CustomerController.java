package com.myProject.restEasyFoodOrder.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myProject.restEasyFoodOrder.Model.Vendor;
import com.myProject.restEasyFoodOrder.Service.CustomerService;
import com.myProject.restEasyFoodOrder.Service.VendorService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private VendorService vendorService;
	
	@GetMapping("/Customer")
	public List<Vendor> list() {
		return vendorService.listAll();
	}
	
	

}
