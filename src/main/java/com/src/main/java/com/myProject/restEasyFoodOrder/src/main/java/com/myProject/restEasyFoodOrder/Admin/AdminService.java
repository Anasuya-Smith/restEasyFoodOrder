package com.myProject.restEasyFoodOrder.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public void delete(Integer id) {
		adminRepo.deleteById(id);
	}

}
