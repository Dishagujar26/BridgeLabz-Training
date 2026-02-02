package com.bl.streamapi.bonuschallenges;

import java.util.*;

public class StudentData {
	public static List<Student> getStudents() {
		return List.of(new Student(1, "Sam", 22, 45, "CS", "Mumbai"), new Student(2, "Riya", 28, 120, "IT", "Pune"),
				new Student(3, "Amit", 24, 90, "CS", "Mumbai"), new Student(4, "Neha", 30, 10, "Mechanical", "Delhi"),
				new Student(5, "Karan", 26, 70, "IT", "Pune"), new Student(6, "Sneha", 21, 15, "CS", "Mumbai"));
	}
}
