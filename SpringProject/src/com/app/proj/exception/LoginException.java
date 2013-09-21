package com.app.proj.exception;

import com.app.proj.util.GenUtil;

public class LoginException extends Exception {

	private static final long serialVersionUID = -2974265074472820907L;
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return GenUtil.generateId();
	}
}