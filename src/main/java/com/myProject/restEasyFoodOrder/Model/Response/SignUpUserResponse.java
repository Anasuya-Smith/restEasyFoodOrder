package com.myProject.restEasyFoodOrder.Model.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SignUpUserResponse {
	@JsonProperty("id")
	private Integer id = null;

	@JsonProperty("status")
	private String status = null;

	public SignUpUserResponse id(Integer id) {
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
	
	

}
