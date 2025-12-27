package com.bl.constructor;

public class Employee {

	public int employeeID;
	protected String department;
	private double salary;

	// Constructor
	Employee(int employeeID, String department, double salary) {
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}

	// Public method to modify private salary
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}
	}

}

class Manager extends Employee {

	String designation;

	Manager(int employeeID, String department, double salary, String designation) {
		super(employeeID, department, salary);
		this.designation = designation;
	}

	void displayManagerDetails() {
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Department: " + department);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + getSalary());
	}
}
