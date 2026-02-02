package com.bl.streamapi.hospitaldoctor;

public class Doctor {

	String doctorName;
	boolean isAvailable;
	int specialty;

	public Doctor(String doctorName, boolean isAvailable, int specialty) {
		super();
		this.doctorName = doctorName;
		this.isAvailable = isAvailable;
		this.specialty = specialty;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public int getSpecialty() {
		return specialty;
	}

}
