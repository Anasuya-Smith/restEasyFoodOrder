package com.myProject.restEasyFoodOrder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.restEasyFoodOrder.Model.Admin;

public interface UserRepository extends JpaRepository<Admin, Integer> {

}



