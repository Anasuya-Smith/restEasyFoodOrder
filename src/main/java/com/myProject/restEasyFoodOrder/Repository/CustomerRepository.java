package com.myProject.restEasyFoodOrder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.restEasyFoodOrder.Model.Orders;

public interface CustomerRepository extends JpaRepository<Orders, Integer> {

}
