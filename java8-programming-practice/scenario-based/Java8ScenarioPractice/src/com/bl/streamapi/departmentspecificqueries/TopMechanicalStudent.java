package com.bl.streamapi.departmentspecificqueries;
import java.util.*;

public class TopMechanicalStudent {
    public static void main(String[] args) {
        List<Student> list = List.of(
            new Student("A","Mechanical",22,5,"MH"),
            new Student("B","Mechanical",21,2,"KA"),
            new Student("C","Computer",23,1,"KA")
        );

        list.stream()
            .filter(s -> s.getDepartment().equalsIgnoreCase("Mechanical"))
            .min(Comparator.comparing(Student::getRank))
            .ifPresent(System.out::println);
    }
}
