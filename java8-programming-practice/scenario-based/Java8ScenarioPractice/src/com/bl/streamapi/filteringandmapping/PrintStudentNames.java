package com.bl.streamapi.filteringandmapping;
import java.util.*;

public class PrintStudentNames {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Karan",10,21,"IT","Mumbai"),
                new Student("Anu",15,22,"Mechanical","Pune")
        );

        list.stream()
            .map(Student::getName)
            .forEach(System.out::println);
    }
}
