package com.myProject.restEasyFoodOrder.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myProject.restEasyFoodOrder.Common.Exception.UserNotFoundException;
import com.myProject.restEasyFoodOrder.Dao.AdminDao;
import com.myProject.restEasyFoodOrder.Model.Admin;
import com.myProject.restEasyFoodOrder.Model.Dishes;
import com.myProject.restEasyFoodOrder.Model.Vendor;
import com.myProject.restEasyFoodOrder.Service.AdminService;
import com.myProject.restEasyFoodOrder.Service.VendorService;

@RestController
public class VendorController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private VendorService vendorService;
	
	@RequestMapping(value = "/Vendor/SignIn", produces = "application/json", method = RequestMethod.POST)
	public Vendor add(@RequestBody Vendor vendorDetail) {
		try {
			Admin existUser = adminService.getUser(adminDao.findByUserName(vendorDetail.getVendorName()));
			if (existUser != null) {
				Vendor vendor = new Vendor();
				vendor.setVendorID(existUser.getId());
				vendor.setVendorName(existUser.getUserName());
				vendor.setDishName(vendorDetail.getDishName());
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
	}
	

}
