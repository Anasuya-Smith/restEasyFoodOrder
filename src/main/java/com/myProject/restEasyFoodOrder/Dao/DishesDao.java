package com.myProject.restEasyFoodOrder.Dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myProject.restEasyFoodOrder.Common.UnexpectedException;
import com.myProject.restEasyFoodOrder.Common.Exception.SignInException;
import com.myProject.restEasyFoodOrder.Model.Dishes;
import com.myProject.restEasyFoodOrder.Model.Vendor;

public class DishesDao {
	
private EntityManager entityManager;
	
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)	
public Dishes createDish(Dishes dishes) throws UnexpectedException, SignInException {
        try {
            entityManager.persist(dishes);
            return dishes;
        } catch (PersistenceException ex) {
            Throwable t = ex.getCause();

            if (t instanceof ConstraintViolationException) {

                if (((ConstraintViolationException) t).getConstraintName().toString().equalsIgnoreCase("dish_name")) {
                    throw new SignInException("EXC-004", "Dish already exist");
                } 
            }
            return null;
        }
	}

}
