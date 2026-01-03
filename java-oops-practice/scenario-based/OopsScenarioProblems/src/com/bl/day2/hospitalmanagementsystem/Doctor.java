package com.bl.day2.hospitalmanagementsystem;

public class Doctor {
	String name;
	String specialization;

	Doctor(String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
	}

	void displayInfo() {
		System.out.println("Doctor: " + name + " | " + specialization);
	}
}
