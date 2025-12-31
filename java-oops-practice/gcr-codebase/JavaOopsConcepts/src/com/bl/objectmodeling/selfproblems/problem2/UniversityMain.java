package com.bl.objectmodeling.selfproblems.problem2;

public class UniversityMain {

	public static void main(String[] args) {
		
		//Composition → University HAS Departments, Aggregation → University HAS Faculty (both exist independently)

		Faculty f1 = new Faculty("Dr. Sharma");
		Faculty f2 = new Faculty("Dr. Mehta");

		University uni = new University("IIT Tech");
		uni.addDepartment("Computer Science");
		uni.addDepartment("Mechanical");

		uni.addFaculty(f1);
		uni.addFaculty(f2);

		uni.showUniversity();

		uni = null; // University deleted
		System.out.println("University deleted");

		// Faculty still exists
		f1.showFaculty();
		f2.showFaculty();
	}
}
