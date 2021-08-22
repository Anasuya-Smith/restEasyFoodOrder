package com.myProject.restEasyFoodOrder.Common.Exception;

import java.io.PrintStream;
import java.io.PrintWriter;

/*
 * SignUpException is thrown when a user is restricted to register due to duplication of data
 */
public class SignUpException extends Exception {
	
	private static final long serialVersionUID = 2L;
	
	private String code;
	private String errorMessage;
	
	public SignUpException(String code, String errorMessage) {
		
		this.code = code;
		this.errorMessage = errorMessage;
	}

	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}

	@Override
	public void printStackTrace(PrintStream s) {
		super.printStackTrace(s);
	}

	@Override
	public void printStackTrace(PrintWriter s) {
		super.printStackTrace(s);
	}
	
	public String getCode() {
        return code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
