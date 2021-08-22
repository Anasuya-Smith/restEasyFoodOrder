package com.myProject.restEasyFoodOrder.Model.Response;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * SignInResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-08-22T02:38+05:30")
public class SignInResponse {
	@JsonProperty("id")
	private Integer id = null;

	@JsonProperty("message")
	private String message = null;

	public SignInResponse(Integer id, String message) {
		
		this.id = id;
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public SignInResponse message(String message) {
		this.message = message;
		return this;
	}
	

}
