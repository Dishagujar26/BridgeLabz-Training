package com.bl.streamapi.filteringandmapping;
import java.util.*;

public class MechanicalStudents {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Rahul",18,23,"Mechanical","Nagpur"),
                new Student("Sneha",25,22,"IT","Mumbai")
        );

        list.stream()
            .filter(s -> s.getBranch().equalsIgnoreCase("Mechanical"))
            .forEach(System.out::println);
    }
}
