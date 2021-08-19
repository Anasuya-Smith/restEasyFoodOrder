package com.myProject.restEasyFoodOrder.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.restEasyFoodOrder.Model.Vendor;
import com.myProject.restEasyFoodOrder.Repository.DishesRepository;
import com.myProject.restEasyFoodOrder.Repository.VendorRepository;

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
