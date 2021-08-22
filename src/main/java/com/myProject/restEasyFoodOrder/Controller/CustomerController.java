package com.myProject.restEasyFoodOrder.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myProject.restEasyFoodOrder.Model.Admin;
import com.myProject.restEasyFoodOrder.Model.Dishes;
import com.myProject.restEasyFoodOrder.Model.Orders;
import com.myProject.restEasyFoodOrder.Model.Vendor;
import com.myProject.restEasyFoodOrder.Service.CustomerService;
import com.myProject.restEasyFoodOrder.Service.VendorService;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private VendorService vendorService;
	
		
	@GetMapping("/Customer")
	public List<Vendor> list() {
		return vendorService.listAll();
	}
	
	@GetMapping("/Customer/Display-Dishes")
	public List<Dishes> listDishes() {
		return customerService.listAllDishes();
	}
	
/*	@PostMapping(value = "/Customer/Place-Order")
	public ResponseEntity<OrderResponse> createOrder(OrderRequest orderRequest) throws UserNotFoundException {
		
	}
*/	
	@RequestMapping(value = "/Customer/Place-Order", produces = "application/json", method = RequestMethod.POST)
	public Orders add(@RequestBody Orders orderDetail) {
		try {
			
			return customerService.save(orderDetail);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
