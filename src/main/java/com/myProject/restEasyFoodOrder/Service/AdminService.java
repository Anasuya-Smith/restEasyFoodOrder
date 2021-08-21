package com.myProject.restEasyFoodOrder.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.restEasyFoodOrder.Model.Admin;
import com.myProject.restEasyFoodOrder.Repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepo;
	
	// Including CURD
	
	public List<Admin> listAllOrders() {
		return adminRepo.findAll();
	}
	
	public void save(Admin user) {
		adminRepo.save(user);
	}
	
	public Admin get(Integer id) {
		return adminRepo.findById(id).get();
	}
	
	public Admin delete(Integer id) {
		Admin deletedUser = adminRepo.findById(id).get();
		adminRepo.deleteById(id);
		return deletedUser;
	}

}
