package com.bl.day4.collegeinformationsystem;

import java.util.ArrayList;
import java.util.List;

class Course {
	private String courseName;
	private Faculty faculty;
	private List<Student> students = new ArrayList<>();

	Course(String courseName, Faculty faculty) {
		this.courseName = courseName;
		this.faculty = faculty;
	}

	void addStudent(Student s) {
		students.add(s);
	}

	void removeStudent(Student s) {
		students.remove(s);
	}

	void showCourseDetails() {
		System.out.println("Course: " + courseName);
		System.out.println("Faculty: " + faculty.name);
		System.out.println("Enrolled Students: " + students.size());
	}
}


