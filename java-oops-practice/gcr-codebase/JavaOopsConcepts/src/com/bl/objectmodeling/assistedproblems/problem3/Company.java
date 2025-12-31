package com.bl.objectmodeling.assistedproblems.problem3;

import java.util.ArrayList;

public class Company {

	String companyName;
	
	// store departments in company
	ArrayList<Department> departments = new ArrayList<>();

	Company(String companyName) {
		this.companyName = companyName;
	}

	void addDepartment(String deptName) {
		departments.add(new Department(deptName)); // created inside
	}

	void showCompany() {
		System.out.println("Company: " + companyName);
		for (Department d : departments) {
			d.showDepartment();
		}
	}

}
