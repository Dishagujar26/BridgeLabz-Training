package com.bl.objectmodeling.selfproblems.problem5;

import java.util.ArrayList;

public class Course {
	 String courseName;
	    Professor professor;
	    ArrayList<Student> students = new ArrayList<>();

	    Course(String courseName) {
	        this.courseName = courseName;
	    }

	    void addStudent(Student student) {
	        students.add(student);
	    }

	    void assignProfessor(Professor professor) {
	        this.professor = professor;
	    }

}
