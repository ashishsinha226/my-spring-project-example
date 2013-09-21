package com.app.proj.beans;

public class LoginBean {

	private String	username;
	private String	password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "\n\nCredentials provided are\n\n\tUsername\t" + this.username + "\n\tPassword\t" + this.password + "\n";
	}
}