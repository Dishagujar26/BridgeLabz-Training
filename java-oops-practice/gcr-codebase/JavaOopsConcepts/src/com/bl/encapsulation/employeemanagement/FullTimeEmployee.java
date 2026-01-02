package com.bl.encapsulation.employeemanagement;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name, salary);
	}

	@Override
	double calculateSalary() {
		return baseSalary; // fixed salary
	}

}
