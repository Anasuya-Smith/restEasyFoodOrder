package com.myProject.restEasyFoodOrder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.restEasyFoodOrder.Model.Order;

public interface CustomerRepository extends JpaRepository<Order, Integer> {

}
