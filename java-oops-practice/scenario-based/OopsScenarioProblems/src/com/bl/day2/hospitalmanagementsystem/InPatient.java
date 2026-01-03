package com.bl.day2.hospitalmanagementsystem;

public class InPatient extends Patient{
	int daysAdmitted;

    InPatient(int id, String name, int days) {
        super(id, name);
        this.daysAdmitted = days;
    }

    @Override
    void displayInfo() {
        System.out.println("InPatient | Days Admitted: " + daysAdmitted);
    }
}
