package com.bl.objectmodeling.selfproblems.problem3;

import java.util.ArrayList;

public class Patient {
	String name;
	
	// a patient visits multiple doctors 
    ArrayList<Doctor> doctors = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

}
