package com.bl.collectors.employeesalarycategorization;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSalaryStats {
	public static void main(String[] args) {

		List<Employee> employees = List.of(new Employee("IT", 50000), new Employee("HR", 40000),
				new Employee("IT", 60000));

		Map<String, Double> avgSalaryByDept = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(avgSalaryByDept);
	}
}