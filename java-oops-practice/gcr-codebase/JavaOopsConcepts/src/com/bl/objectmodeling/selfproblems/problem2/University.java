package com.bl.objectmodeling.selfproblems.problem2;

import java.util.ArrayList;

public class University {
	    String universityName;

	    // Composition - store departments in university 
	    ArrayList<Department> departments = new ArrayList<>();

	    // Aggregation - store faculty 
	    ArrayList<Faculty> faculties = new ArrayList<>();

	    University(String universityName) {
	        this.universityName = universityName;
	    }

	    void addDepartment(String deptName) {
	        departments.add(new Department(deptName)); // created inside
	    }

	    void addFaculty(Faculty faculty) {
	        faculties.add(faculty); // external object
	    }

	    void showUniversity() {
	        System.out.println("University: " + universityName);

	        System.out.println("Departments:");
	        for (Department d : departments) {
	            d.showDepartment();
	        }

	        System.out.println("Faculty Members:");
	        for (Faculty f : faculties) {
	            f.showFaculty();
	        }
	  }

}
