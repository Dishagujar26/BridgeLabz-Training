package com.bl.realtimescenariobased.queries;

import java.util.List;
import java.util.stream.Collectors;

import com.bl.realtimescenariobased.model.Employee;

public class DepartmentQueries {

	public static void departments(List<Employee> list) {
		list.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

	public static void countByDept(List<Employee> list) {
		System.out
				.println(list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));
	}
}
