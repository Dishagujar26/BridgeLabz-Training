package com.bl.streamapi.departmentspecificqueries;
import java.util.*;
import java.util.stream.*;

public class StudentsByDepartment {
    public static void main(String[] args) {
        List<Student> list = List.of(
            new Student("A","Computer",22,5,"MH"),
            new Student("B","Mechanical",21,8,"KA"),
            new Student("C","Computer",23,3,"KA")
        );

        Map<String, List<String>> result =
                list.stream()
                    .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.mapping(Student::getName, Collectors.toList())
                    ));

        System.out.println(result);
    }
}
