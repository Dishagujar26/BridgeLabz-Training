package com.bl.day5.personalizedlearningpatform;

public class Instructor extends User {

	private String department;

	public Instructor(String name, String email, int userId, String department) {
		super(name, email, userId);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}
}
