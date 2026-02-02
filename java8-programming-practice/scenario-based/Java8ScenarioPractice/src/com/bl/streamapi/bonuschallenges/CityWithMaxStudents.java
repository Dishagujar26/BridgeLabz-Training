package com.bl.streamapi.bonuschallenges;

import java.util.*;
import java.util.stream.*;

public class CityWithMaxStudents {
	public static void main(String[] args) {
		List<Student> students = StudentData.getStudents();

		String city = students.stream().collect(Collectors.groupingBy(Student::getCity, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

		System.out.println(city);
	}
}
