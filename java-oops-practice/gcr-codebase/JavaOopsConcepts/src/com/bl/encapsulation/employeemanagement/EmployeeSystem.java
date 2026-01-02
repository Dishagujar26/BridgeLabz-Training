package com.bl.encapsulation.employeemanagement;

public class EmployeeSystem {

	public static void main(String[] args) {

		Employee e1 = new FullTimeEmployee(101, "Amit", 50000);
		Employee e2 = new PartTimeEmployee(102, "Neha", 80, 300);

		e1.assignDepartment("IT");
		e2.assignDepartment("HR");

		Employee[] employees = { e1, e2 };

		for (Employee emp : employees) {
			emp.displayDetails();
		}
	}

}
