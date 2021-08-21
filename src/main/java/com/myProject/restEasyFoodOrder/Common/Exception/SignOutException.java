package com.myProject.restEasyFoodOrder.Common.Exception;

import java.io.PrintStream;
import java.io.PrintWriter;

public class SignOutException extends Exception {
	
	// Default serial version ID
	private static final long serialVersionUID = 3L;
	
	private String code;
	private String errorMessage;
	
	public SignOutException(String code, String errorMessage) {
		
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
