package com.bl.encapsulation.hospitalpatientmanagement;

public class InPatient extends Patient implements MedicalRecord {
	private int daysAdmitted;
	private double dailyCharge;
	private String medicalHistory = "";

	public InPatient(int id, String name, int age, int days, double charge) {
		super(id, name, age);
		this.daysAdmitted = days;
		this.dailyCharge = charge;
	}

	public double calculateBill() {
		return daysAdmitted * dailyCharge;
	}

	public void addRecord(String record) {
		medicalHistory += record + "\n";
	}

	public void viewRecords() {
		System.out.println("Medical History:\n" + medicalHistory);
	}
}
