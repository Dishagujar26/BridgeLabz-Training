package com.bl.inheritance.assistedproblems.employeemanagementsystem;

public class Employee {
	
	double salaray;
	String name;
	int id;
	
	public Employee(double salaray, String name, int id) {
		super();
		this.salaray = salaray;
		this.name = name;
		this.id = id;
	}
	
	// method to display employee details
	void displayDetails() {
		System.out.println("\nEmployee Name "+ name);
		System.out.println("Employee Salary "+ salaray);
		System.out.println("Employee Id "+ id);

	}
	

}
