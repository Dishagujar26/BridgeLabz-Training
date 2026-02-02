package com.bl.streamapi.departmentspecificqueries;
import java.util.*;

public class YoungestComputerStudent {
    public static void main(String[] args) {
        List<Student> list = List.of(
            new Student("A","Computer",22,5,"MH"),
            new Student("B","Computer",19,8,"KA"),
            new Student("C","Mechanical",20,3,"KA")
        );

        list.stream()
            .filter(s -> s.getDepartment().equalsIgnoreCase("Computer"))
            .min(Comparator.comparing(Student::getAge))
            .ifPresent(System.out::println);
    }
}
