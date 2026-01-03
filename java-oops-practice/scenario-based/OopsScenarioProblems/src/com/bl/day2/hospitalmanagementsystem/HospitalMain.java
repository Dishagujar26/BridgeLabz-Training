package com.bl.day2.hospitalmanagementsystem;

public class HospitalMain {
	public static void main(String[] args) {

		Patient p1 = new InPatient(1, "Rahul", 5);
		Patient p2 = new OutPatient(2, "Anita");

		Doctor d1 = new Doctor("Dr. Mehta", "Cardiology");

		Bill bill = new Bill(20000);

		System.out.println(p1.getSummary());
		p1.displayInfo();

		System.out.println(p2.getSummary());
		p2.displayInfo();

		d1.displayInfo();
		System.out.println("Total Bill: " + bill.calculatePayment());
	}
}
