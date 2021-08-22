package com.myProject.restEasyFoodOrder.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.restEasyFoodOrder.Common.UnexpectedException;
import com.myProject.restEasyFoodOrder.Common.Exception.SignInException;
import com.myProject.restEasyFoodOrder.Common.Exception.UserNotFoundException;
import com.myProject.restEasyFoodOrder.Dao.DishesDao;
import com.myProject.restEasyFoodOrder.Dao.VendorDao;
import com.myProject.restEasyFoodOrder.Model.Admin;
import com.myProject.restEasyFoodOrder.Model.Dishes;
import com.myProject.restEasyFoodOrder.Model.Vendor;
import com.myProject.restEasyFoodOrder.Repository.DishesRepository;
import com.myProject.restEasyFoodOrder.Repository.VendorRepository;

@Service
public class VendorService {
	
	@Autowired
	private VendorRepository vendorRepo;
	
	@Autowired
	private DishesRepository dishesRepo;
	
	//@Autowired
	//private VendorDao vendorDao;
	
	//@Autowired(required = true)
	//private DishesDao dishesDao;
	
	//Vendor
	
	//To list all vendors
	public List<Vendor> listAll() {
		return vendorRepo.findAll();
	}

	//To save a new vendor while login
	public Vendor save(Vendor vendor) throws SignInException {
		return vendorRepo.save(vendor);
		//return vendorDao.createUser(vendor);
		//return null;
	}
	
	//Find vendor by name
	public Vendor getUser(Vendor userName) {
		return vendorRepo.findById(userName.getId()).get();
	}
	
	//Find vendor by vendorID
	public Vendor get(Integer id) {
		return vendorRepo.findById(id).get();
	}
	
	
	//Dishes

	//to list all dishes
	public List<Dishes> listDishes() {
		return dishesRepo.findAll();
	}
	
	//To save a new dish
	public Dishes save(Dishes dishes) throws UnexpectedException, SignInException {
		//DishesDao dishesDao = new DishesDao();
		//return dishesDao.createDish(dishes);
		return dishesRepo.save(dishes);
	}
	
	//Get dish by name
	public Dishes get(String name) {
		return dishesRepo.getById(name);
	}
	
	

}

/*
 public Admin delete(Integer id) {
	Admin deletedUser = adminRepo.findById(id).get();
	adminRepo.deleteById(id);
	return deletedUser;
}

 */



