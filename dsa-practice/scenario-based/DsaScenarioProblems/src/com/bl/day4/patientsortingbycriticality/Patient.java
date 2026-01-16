package com.bl.day4.patientsortingbycriticality;

public class Patient {
	String name;
	int criticality;

	public Patient(String name, int criticality) {
		super();
		this.name = name;
		this.criticality = criticality;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", criticality=" + criticality + "]";
	}
	

}
