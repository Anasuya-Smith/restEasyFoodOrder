package com.myProject.restEasyFoodOrder.Model.Response;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SignUpUserRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-08-22T02:44+05:30")
public class SignUpUserRequest {
	
	@JsonProperty("vendor")
	private Boolean isVendor = null;
	
	@JsonProperty("customer")
	private Boolean isCustomer = null;
	
	@JsonProperty("user_name")
	private String userName = null;
	
	@JsonProperty("password")
	private String password = null;

	public SignUpUserRequest vendor(Boolean isVendor) {
		this.isVendor = isVendor;
		return this;
	}
	
	/*
	 * Checking the new user is a vendor
	 * @return isVendor
	 */
	@ApiModelProperty(required = true, value = "Is Vendor?")
	public Boolean getVendor() {
		return isVendor;
	}
	
	public SignUpUserRequest customer(Boolean isCustomer) {
		this.isCustomer = isCustomer;
		return this;
	}
	
	/*
	 * Checking the new user is a customer
	 * @return isVendor
	 */
	@ApiModelProperty(required = true, value = "Is Customer?")
	public Boolean getCustomer() {
		return isCustomer;
	}

	/*
	 * User name of new user
	 * @return userName
	 */
	@ApiModelProperty(required = true, value = "User name")
	public String getUserName() {
		return userName;
	}

	/*
	 * Password of new user
	 * @return password
	 */
	@ApiModelProperty(required = true, value = "Password")
	public String getPassword() {
		return password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isCustomer == null) ? 0 : isCustomer.hashCode());
		result = prime * result + ((isVendor == null) ? 0 : isVendor.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    SignUpUserRequest signupUserRequest = (SignUpUserRequest) o;
	    return Objects.equals(this.isVendor, signupUserRequest.isVendor) &&
	        Objects.equals(this.isCustomer, signupUserRequest.isCustomer) &&
	        Objects.equals(this.userName, signupUserRequest.userName) &&
	        Objects.equals(this.password, signupUserRequest.password);
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class SignUpUserRequest {\n");
	    
	    sb.append("    isVendor: ").append(toIndentedString(isVendor)).append("\n");
	    sb.append("    isCustomer: ").append(toIndentedString(isCustomer)).append("\n");
	    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
	    sb.append("    password: ").append(toIndentedString(password)).append("\n");
	    sb.append("}");
	    return sb.toString();
	}
	
	/**
	  * Convert the given object to string with each line indented by 4 spaces
	  * (except the first line).
	  */
	private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	}
	
}
