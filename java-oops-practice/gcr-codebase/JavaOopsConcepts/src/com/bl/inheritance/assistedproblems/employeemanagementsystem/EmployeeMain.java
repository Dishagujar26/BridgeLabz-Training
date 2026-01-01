package com.bl.inheritance.assistedproblems.employeemanagementsystem;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp = new Manager(67000.00,"Rajiv Bhatia", 01,18);
		emp.displayDetails();
		
		emp = new Developer(67000.00,"Rajiv Bhatia", 01,"Java");
		emp.displayDetails();
		
		emp = new Intern(67000.00,"Rajiv Bhatia", 01,"Product Design");
		emp.displayDetails();	

	}

}
