package com.bl.day2.hospitalmanagementsystem;

public abstract class Patient {

	private int id;
	private String name;
	private String medicalHistory;

	Patient(int id, String name) { // normal admission
		this.id = id;
		this.name = name;
	}

	Patient(int id, String name, String history) { // emergency admission
		this(id, name);
		this.medicalHistory = history;
	}

	public String getSummary() {
		return "Patient ID: " + id + ", Name: " + name;
	}

	abstract void displayInfo();

}
