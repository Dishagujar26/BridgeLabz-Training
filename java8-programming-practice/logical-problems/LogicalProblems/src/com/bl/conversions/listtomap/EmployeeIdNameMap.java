package com.bl.conversions.listtomap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeIdNameMap {
    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee(1, "Amit"),
                new Employee(2, "Neha")
        );

        Map<Integer, String> map =
                list.stream()
                    .collect(Collectors.toMap(e -> e.id, e -> e.name));

        System.out.println(map);
    }
}