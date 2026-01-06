package com.bl.day4.collegeinformationsystem;

public class Faculty extends Person{
	private String department;

	 Faculty(int id, String name, String email, String department) {
	     super(id, name, email);
	     this.department = department;
	 }

	 void printDetails() {
	     System.out.println("Faculty: " + name + ", Dept: " + department);
	 }
     
}
