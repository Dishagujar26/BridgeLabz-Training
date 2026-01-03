package com.bl.day2.hospitalmanagementsystem;

public class OutPatient extends Patient {
	OutPatient(int id, String name) {
		super(id, name);
	}

	@Override
	void displayInfo() {
		System.out.println("OutPatient | Visit Only");
	}
}
