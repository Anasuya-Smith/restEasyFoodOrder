package com.myProject.restEasyFoodOrder.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myProject.restEasyFoodOrder.Model.Admin;
import com.myProject.restEasyFoodOrder.Model.Orders;
import com.myProject.restEasyFoodOrder.Service.AdminService;
import com.myProject.restEasyFoodOrder.Service.CustomerService;


@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/Admin")
	public List<Orders> list() {
		return customerService.listAllOrders();
	}
	
	@GetMapping("/Admin/Display-User/{id}")
	public ResponseEntity<Admin> get(@PathVariable Integer id) {
		try {
			Admin userDetail = adminService.get(id);
			return new ResponseEntity<Admin>(userDetail, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/Admin/Register", produces = "application/json", method = RequestMethod.POST)
	public void add(@RequestBody Admin userDetail) {
		try {
			adminService.save(userDetail);
			//System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@PutMapping("/Admin/update-{id}")
	public ResponseEntity<?> update(@RequestBody Admin userDetail, @PathVariable Integer id) {
		try {
			Admin existUser = adminService.get(id);
			existUser.setUserName(userDetail.getUserName());
			existUser.setPassword(userDetail.getPassword());
			existUser.setCustomer(userDetail.getCustomer());
			existUser.setVendor(userDetail.getVendor());
			adminService.save(existUser);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("Admin/{id}")
	public void delete(@PathVariable Integer id) {
		adminService.delete(id);
	}

}
