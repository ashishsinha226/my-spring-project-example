package com.app.proj.exception;

import com.app.proj.util.GenUtil;

public class AppException extends Exception {

	private static final long	serialVersionUID	= 7018894300189513137L;
	private Exception			thrownException;
	private String				message;
	private String				labelMessage;
	private String				type;
	
	public Exception getThrownException() {
		return thrownException;
	}

	public void setThrownException(Exception thrownException) {
		this.thrownException = thrownException;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		if (this.thrownException != null) {
			this.message = this.thrownException.getMessage();
		}
		this.message = message;
	}

	public String getLabelMessage() {
		return labelMessage;
	}

	public void setLabelMessage(String labelMessage) {
		this.labelMessage = labelMessage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return GenUtil.generateId();
	}
}