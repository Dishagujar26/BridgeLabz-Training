package com.bl.encapsulation.hospitalpatientmanagement;

public class OutPatient extends Patient implements MedicalRecord {

	private double consultationFee;
	private String medicalHistory = "";

	public OutPatient(int id, String name, int age, double fee) {
		super(id, name, age);
		this.consultationFee = fee;
	}

	public double calculateBill() {
		return consultationFee;
	}

	public void addRecord(String record) {
		medicalHistory += record + "\n";
	}

	public void viewRecords() {
		System.out.println("Medical History:\n" + medicalHistory);
	}
}
