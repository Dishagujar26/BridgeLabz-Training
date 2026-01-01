package com.bl.inheritance.assistedproblems.employeemanagementsystem;

public class Intern extends Employee{
	String department;

	public Intern(double salaray, String name, int id, String department) {
		super(salaray, name, id);
		this.department = department;
	}
	
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Inter's Department " + department );

	}

}
