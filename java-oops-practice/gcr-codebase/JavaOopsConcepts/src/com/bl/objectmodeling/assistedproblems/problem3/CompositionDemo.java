package com.bl.objectmodeling.assistedproblems.problem3;

public class CompositionDemo {

	public static void main(String[] args) {
		
		// Composition is a strong HAS-A relationship where child objects cannot exist without the parent.
		// A Company has Departments, and Departments have Employees. If the Company is closed, Departments and Employees automatically cease to exist.

		Company company = new Company("TechNova");

		company.addDepartment("IT");
		company.addDepartment("HR");

		// get department from company at index 0(IT) and 1(HR) and add employees to respective department
		company.departments.get(0).addEmployee("Disha");
		company.departments.get(0).addEmployee("Aman");
		company.departments.get(1).addEmployee("Riya");
		company.showCompany();

		company = null; // Company deleted Departments & Employees are also gone

	}
}
