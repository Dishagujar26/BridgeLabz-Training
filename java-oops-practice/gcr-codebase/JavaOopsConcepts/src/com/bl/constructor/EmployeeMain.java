package com.bl.constructor;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();
		sc.nextLine(); 

		System.out.print("Enter Department: ");
		String dept = sc.nextLine();

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();
		sc.nextLine(); // buffer clear

		System.out.print("Enter Designation: ");
		String designation = sc.nextLine();

		Manager mgr = new Manager(id, dept, salary, designation);

		mgr.displayManagerDetails();

		// modify salary using public method
		System.out.print("\nEnter Updated Salary: ");
		double newSalary = sc.nextDouble();
		mgr.setSalary(newSalary);

		System.out.println("Updated Salary: " + mgr.getSalary());

		sc.close();
	}
}
