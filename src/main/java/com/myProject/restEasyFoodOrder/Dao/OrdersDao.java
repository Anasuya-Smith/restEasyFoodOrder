package com.myProject.restEasyFoodOrder.Dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myProject.restEasyFoodOrder.Common.Exception.OrderException;
import com.myProject.restEasyFoodOrder.Common.Exception.SignInException;
import com.myProject.restEasyFoodOrder.Model.Orders;
import com.myProject.restEasyFoodOrder.Model.Vendor;

@Repository
public class OrdersDao {
	private EntityManager entityManager;
	
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Orders createOrder(Orders orderEntity) throws OrderException {
        try {
            entityManager.persist(orderEntity);
            return orderEntity;
        } catch (PersistenceException ex) {
            Throwable t = ex.getCause();

            if (t instanceof ConstraintViolationException) {

                if (((ConstraintViolationException) t).getConstraintName().toString().equalsIgnoreCase("vendor_name")) {
                    throw new OrderException("EXC-005", "Order not successful");
                } 
            }
            return null;
        }
	}

}
