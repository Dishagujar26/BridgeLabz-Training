package com.bl.encapsulation.employeemanagement;

public abstract class Employee {
	
	private int employeeId;
	private String name;
	protected double baseSalary;
	private String department;

	public Employee(int employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	// Interface methods
	public void assignDepartment(String dept) {
		this.department = dept;
	}

	public String getDepartmentDetails() {
		return department;
	}

	abstract double calculateSalary();

	// Concrete method
	public void displayDetails() {
		System.out.println("ID: " + employeeId + "\nName: " + name + "\nDepartment: " + department + "\nSalary: "+ calculateSalary());
	}

}
