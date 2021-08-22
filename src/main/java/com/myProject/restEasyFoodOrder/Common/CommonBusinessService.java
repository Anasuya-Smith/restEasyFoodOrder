package com.myProject.restEasyFoodOrder.Common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.restEasyFoodOrder.Dao.AdminDao;
import com.myProject.restEasyFoodOrder.Dao.VendorDao;
import com.myProject.restEasyFoodOrder.Model.Admin;

@Service
public class CommonBusinessService {
	
	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private VendorDao vendorDao;

	public Admin signup(Admin userEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Admin signin(String authorization) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
