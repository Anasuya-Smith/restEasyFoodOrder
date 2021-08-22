package com.myProject.restEasyFoodOrder.Dao;

import java.rmi.UnexpectedException;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Repository;

import com.myProject.restEasyFoodOrder.Common.Exception.SignUpException;
import com.myProject.restEasyFoodOrder.Model.Admin;

@Repository
public class AdminDao {
	
	private EntityManager entityManager;
	
	public Admin createUser(Admin userEntity) throws SignUpException{
        try {
            entityManager.persist(userEntity);
            return userEntity;
        } catch (PersistenceException ex) {
            Throwable t = ex.getCause();

            if (t instanceof ConstraintViolationException) {

                if (((ConstraintViolationException) t).getConstraintName().toString().equalsIgnoreCase("user_name")) {
                    throw new SignUpException("EXC-001", "Try another username");
                } else if (((ConstraintViolationException) t).getConstraintName().toString().equalsIgnoreCase("password")) {
                    throw new SignUpException("EXC-002",  "Try another password");
                }
            }
            return null;
        }
	}
	
	public Admin findByUserName(String userName) {
		try {
			return entityManager.createNamedQuery("displayByUserName", Admin.class).setParameter("userName", userName).getSingleResult();
		} catch(NoResultException nre) {
			return null;
		}
	}
	
	public Admin findByUserID(Integer userID) {
		try {
			return entityManager.createNamedQuery("displayByUserID", Admin.class).setParameter("id", userID).getSingleResult();
		} catch(NoResultException nre) {
			return null;
		}
	}
	
	public Admin deleteUserByName(String userName) {
		try {
			return entityManager.createNamedQuery("deleteByUserName", Admin.class).setParameter("userName", userName).getSingleResult();
		} catch(NoResultException nre) {
			return null;
		}
	}
	
	public Admin deleteUserByID(Integer userID) {
		try {
			return entityManager.createNamedQuery("deleteByUserID", Admin.class).setParameter("id", userID).getSingleResult();
		} catch(NoResultException nre) {
			return null;
		}
	}
	
	public Admin updateUserName(String userName) {
		try {
			return entityManager.createNamedQuery("updateUserName", Admin.class).setParameter("userName", userName).getSingleResult();
		} catch(NoResultException nre) {
			return null;
		}
	}
	
	public Admin updatePassword(String password) {
		try {
			return entityManager.createNamedQuery("updatePassword", Admin.class).setParameter("password", password).getSingleResult();
		} catch(NoResultException nre) {
			return null;
		}
	}


}
