package com.bl.encapsulation.hospitalpatientmanagement;

public abstract class Patient {
	private int patientId;
    private String name;
    private int age;

    // sensitive data
    private String diagnosis;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Encapsulation
    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId +", Name: " + name +", Age: " + age);
    }

    public abstract double calculateBill();
}

