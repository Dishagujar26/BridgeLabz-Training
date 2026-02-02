package com.bl.streamapi.filteringandmapping;
import java.util.*;

public class AgeGreaterThan25 {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Neha",30,27,"Civil","Delhi"),
                new Student("Riya",20,23,"Mechanical","Mumbai")
        );

        list.stream()
            .filter(s -> s.getAge() > 25)
            .forEach(System.out::println);
    }
}
