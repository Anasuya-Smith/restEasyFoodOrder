package com.myProject.restEasyFoodOrder.Controller;


import java.sql.Date;
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
import com.myProject.restEasyFoodOrder.Service.AdminService;
import com.myProject.restEasyFoodOrder.Service.CustomerService;
import com.myProject.restEasyFoodOrder.Service.VendorService;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private VendorService vendorService;
	
	@Autowired
	private AdminService adminService;
	
		
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
	@RequestMapping(value = "/Customer/PlaceOrder", produces = "application/json", method = RequestMethod.POST)
	public Orders add(@RequestBody Orders orderDetail) {
		try {
			Admin existCustomer = adminService.get(orderDetail.getCustomerID());
			Vendor existVendor =vendorService.get(orderDetail.getCustomerID());
			Dishes availableDish = vendorService.get(orderDetail.getDishName());
			if (existCustomer != null && availableDish != null) {
				//Date today = java.time.Date.now();
				Orders order = new Orders();
				order.setOrderDate(orderDetail.getOrderDate());
				order.setDishID(availableDish.getDishID());
				order.setCustomerID(existCustomer.getId());
				order.setVendorName(existCustomer.getUserName());
				order.setDishName(orderDetail.getDishName());
				order.setDishPrice(existVendor.getVendorDishPrice());
				order.setCustOrderQuantity(orderDetail.getCustOrderQuantity());
				float amount = (orderDetail.getDishPrice())*(orderDetail.getCustOrderQuantity());
				order.setOrderAmount(amount);
				
				return customerService.save(order);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}

/*
@RequestMapping(value = "/Vendor/SignIn", produces = "application/json", method = RequestMethod.POST)
public Vendor add(@RequestBody Vendor vendorDetail) {
	try {
		//Admin existUser = adminService.getUser(adminDao.findByUserName(vendorDetail.getVendorName()));
		Admin existUser = adminService.getUser(vendorDetail.getVendorName());
		if (existUser != null) {
			Vendor vendor = new Vendor();
			vendor.setVendorID(existUser.getId());
			vendor.setVendorName(existUser.getUserName());
			vendor.setDishName(vendorDetail.getDishName());
			vendor.setDishCal(vendorDetail.getDishCal());
			vendor.setVendorDishPrice(vendorDetail.getVendorDishPrice());
			
			Dishes dishes = new Dishes();
			dishes.setDishName(vendorDetail.getDishName());
			dishes.setDishCal(vendorDetail.getDishCal());
			vendorService.save(dishes);
		
		return vendorService.save(vendor);
		}
		
	} catch (Exception nre) {
		System.out.println(nre);
	}
	return null;
}*/