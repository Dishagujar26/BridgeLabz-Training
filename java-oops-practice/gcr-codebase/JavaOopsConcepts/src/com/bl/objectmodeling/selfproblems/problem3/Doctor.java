package com.bl.objectmodeling.selfproblems.problem3;

import java.util.ArrayList;

public class Doctor {
	String name;
	
	// A doctor sees many patients
	ArrayList<Patient> patients = new ArrayList<>();

	Doctor(String name) {
		this.name = name;
	}

	void consult(Patient patient) {
		patients.add(patient);
		patient.addDoctor(this); // two-way association

		System.out.println("Consultation:");
		System.out.println("Doctor " + name + " is consulting Patient " + patient.name);
	}

}
