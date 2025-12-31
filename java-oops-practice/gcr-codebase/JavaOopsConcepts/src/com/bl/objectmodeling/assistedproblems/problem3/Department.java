package com.bl.objectmodeling.assistedproblems.problem3;

import java.util.ArrayList;
import java.util.List;

public class Department {

	String deptName;
	
	// store employees in department 
	ArrayList<Employee> employees = new ArrayList<>();

	Department(String deptName) {
		this.deptName = deptName;
	}

	void addEmployee(String empName) {
		employees.add(new Employee(empName)); // created inside
	}

	void showDepartment() {
		System.out.println("Department: " + deptName);
		for (Employee e : employees) {
			e.showEmployee();
		}
	}

}
