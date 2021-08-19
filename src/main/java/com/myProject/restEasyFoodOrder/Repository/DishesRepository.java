package com.myProject.restEasyFoodOrder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProject.restEasyFoodOrder.Model.Dishes;

public interface DishesRepository extends JpaRepository<Dishes, Integer>{

}
