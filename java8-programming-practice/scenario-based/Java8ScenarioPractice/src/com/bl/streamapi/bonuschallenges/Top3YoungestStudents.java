package com.bl.streamapi.bonuschallenges;

import java.util.*;

public class Top3YoungestStudents {
	public static void main(String[] args) {
		List<Student> students = StudentData.getStudents();

		students.stream().sorted(Comparator.comparing(Student::getAge)).limit(3).forEach(System.out::println);
	}
}
