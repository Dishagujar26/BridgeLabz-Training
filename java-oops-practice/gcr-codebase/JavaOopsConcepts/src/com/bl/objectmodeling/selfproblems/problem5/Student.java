package com.bl.objectmodeling.selfproblems.problem5;

import java.util.ArrayList;

public class Student {
	String name;
	ArrayList<Course> courses = new ArrayList<>();

	Student(String name) {
		this.name = name;
	}

	void enrollCourse(Course course) {
		courses.add(course);
		course.addStudent(this); // communication
		System.out.println(name + " enrolled in " + course.courseName);
	}
}
