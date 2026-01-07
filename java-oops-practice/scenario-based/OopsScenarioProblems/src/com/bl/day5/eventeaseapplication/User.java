package com.bl.day5.eventeaseapplication;

public class User {
	private String name;
	private String email; // sensitive data
	private String phone;

	User(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
}
