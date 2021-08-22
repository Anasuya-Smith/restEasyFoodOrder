package com.myProject.restEasyFoodOrder.Dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myProject.restEasyFoodOrder.Common.Exception.SignInException;
import com.myProject.restEasyFoodOrder.Common.Exception.SignUpException;
import com.myProject.restEasyFoodOrder.Model.Admin;
import com.myProject.restEasyFoodOrder.Model.Vendor;

@Repository
//@Stateless
public class VendorDao {
	
	private EntityManager entityManager;
	
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Vendor createUser(Vendor userEntity) throws SignInException {
        try {
            entityManager.persist(userEntity);
            return userEntity;
        } catch (PersistenceException ex) {
            Throwable t = ex.getCause();

            if (t instanceof ConstraintViolationException) {

                if (((ConstraintViolationException) t).getConstraintName().toString().equalsIgnoreCase("vendor_name")) {
                    throw new SignInException("EXC-003", "Vendor does not exist");
                } 
            }
            return null;
        }
	}
	

}
