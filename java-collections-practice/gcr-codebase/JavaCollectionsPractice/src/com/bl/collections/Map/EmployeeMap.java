package com.bl.collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EmployeeMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbe of employees");
		int n = sc.nextInt();
		sc.nextLine();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the name of employee: ");
			String name = sc.nextLine();

			System.out.println("Enter the department of the employee: ");
			String dept = sc.nextLine();

			Employee e = new Employee(name, dept);
			list.add(e);
		}
		HashMap<String, List<Employee>> map = new HashMap<>();
		for (Employee e : list) {
			if (!map.containsKey(e.department)) {
				map.put(e.department, new ArrayList<>());
			}
			map.get(e.department).add(e);
		}
		// shortcut -------> for (Employee e : employees) {
		// map.computeIfAbsent(e.department, k -> new ArrayList<>()).add(e);
		
        map.forEach((k, v) -> System.out.println(k + " -> " + v));

	}

}
