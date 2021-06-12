package it.avenue813.model;

import java.io.Serializable;


public class UserBean implements Serializable {

	private static final long serialVersionUID = 1;
	
	String name;
	String second_name;
	String username;
	String date;
	String password;
	String email;
	
	public UserBean() {
		name = "";
		second_name = "";
		username = "";
		date = null;
		password = "";
		email = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecond_name() {
		return second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}