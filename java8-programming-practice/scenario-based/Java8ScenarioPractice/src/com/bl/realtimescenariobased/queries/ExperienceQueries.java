package com.bl.realtimescenariobased.queries;

import java.util.List;

import com.bl.realtimescenariobased.model.Employee;

public class ExperienceQueries {

    public static void joinedAfter2015(List<Employee> list) {
        list.stream()
            .filter(e -> e.getYearOfJoining() > 2015)
            .map(Employee::getName)
            .forEach(System.out::println);
    }
}
