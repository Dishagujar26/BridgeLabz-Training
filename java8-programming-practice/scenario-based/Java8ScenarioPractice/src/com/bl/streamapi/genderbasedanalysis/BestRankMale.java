package com.bl.streamapi.genderbasedanalysis;
import java.util.*;

public class BestRankMale {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A","Male",22,5),
                new Student("B","Female",21,8),
                new Student("C","Male",23,2)
        );

        list.stream()
            .filter(s -> s.getGender().equalsIgnoreCase("Male"))
            .min(Comparator.comparing(Student::getRank))
            .ifPresent(System.out::println);
    }
}
