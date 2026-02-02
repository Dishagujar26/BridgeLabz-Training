package com.bl.realtimescenariobased.queries;

import java.util.List;
import java.util.stream.Collectors;

import com.bl.realtimescenariobased.model.Employee;

public class GenderQueries {

    public static void countByGender(List<Employee> list) {
        System.out.println(
            list.stream()
                .collect(Collectors.groupingBy(
                    Employee::getGender, Collectors.counting()))
        );
    }

    public static void avgAgeByGender(List<Employee> list) {
        System.out.println(
            list.stream()
                .collect(Collectors.groupingBy(
                    Employee::getGender,
                    Collectors.averagingInt(Employee::getAge)))
        );
    }
}
