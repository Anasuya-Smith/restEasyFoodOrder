package com.myProject.restEasyFoodOrder.Common;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.MessageFormat;

/*
 * UnexpectedException class to handle unexpected exceptions
 */
public class UnexpectedException extends RuntimeException {
	
		//Version ID
		private static final long serialVersionUID = 2737472949025937415L;
		
		private ErrorCode errorCode;
		private Throwable cause;
		private Object[] parameters;
		
		public UnexpectedException(ErrorCode errorCode, Object[] parameters) {
			super();
			this.errorCode = errorCode;
			this.parameters = parameters;
		}

		public UnexpectedException(ErrorCode errorCode, Throwable cause, Object[] parameters) {
			super();
			this.errorCode = errorCode;
			this.cause = cause;
			this.parameters = parameters;
		}

		public ErrorCode getErrorCode() {
			return errorCode;
		}
		
		@Override
		public String getMessage() {
			return MessageFormat.format(errorCode.getDefaultMessage(), this.parameters);
		}
		
		@Override
		public Throwable getCause() {
			return cause;
		}
		
		@Override
		public final void printStackTrace(final PrintStream stream) {
			super.printStackTrace(stream);
		}
		
		@Override
		public final void printStackTrace(final PrintWriter writer) {
			super.printStackTrace(writer);
		}


}
