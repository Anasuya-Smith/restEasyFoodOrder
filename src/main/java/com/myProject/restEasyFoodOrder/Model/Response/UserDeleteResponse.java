package com.myProject.restEasyFoodOrder.Model.Response;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.myProject.restEasyFoodOrder.Model.Admin;

public class UserDeleteResponse {

	@JsonProperty("id")
	private Integer id = null;

	@JsonProperty("status")
	private String status = null;

	public UserDeleteResponse id(Integer id) {
	    this.id = id;
	    return this;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public UserDeleteResponse status(String status) {
	    this.status = status;
	    return this;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
