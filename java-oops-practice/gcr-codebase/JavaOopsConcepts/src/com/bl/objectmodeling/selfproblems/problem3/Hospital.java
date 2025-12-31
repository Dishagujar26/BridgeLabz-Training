package com.bl.objectmodeling.selfproblems.problem3;

import java.util.ArrayList;

public class Hospital {
	
	// association is One class has a reference of another doctor and patient are associated
	String hospitalName;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

}
