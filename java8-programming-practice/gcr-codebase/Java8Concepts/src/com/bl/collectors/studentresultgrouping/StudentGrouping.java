package com.bl.collectors.studentresultgrouping;

import java.util.*;
import java.util.stream.*;

public class StudentGrouping {
	public static void main(String[] args) {

		List<Students> students = List.of(new Students("ajki", "A"), new Students("afsgt", "B"),
				new Students("hjus", "A"));

		Map<String, List<String>> result = students.stream().collect(
				Collectors.groupingBy(Students::getGrade, Collectors.mapping(Students::getName, Collectors.toList())));

		System.out.println(result);
	}
}
