package com.bl.realtimescenariobased.queries;

import java.util.Comparator;
import java.util.List;

import com.bl.realtimescenariobased.model.Employee;

public class SalaryQueries {

    public static void highestPaid(List<Employee> list) {
        list.stream()
            .max(Comparator.comparing(Employee::getSalary))
            .ifPresent(System.out::println);
    }

    public static void topFiveHighest(List<Employee> list) {
        list.stream()
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .limit(5)
            .forEach(System.out::println);
    }
}
