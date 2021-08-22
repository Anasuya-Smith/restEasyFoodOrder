package com.myProject.restEasyFoodOrder.Model.Response;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * SignUpResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-08-22T02:40+05:30")
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
	
	public SignUpUserResponse status(String status) {
		this.status = status;
		return this;
	}

}
