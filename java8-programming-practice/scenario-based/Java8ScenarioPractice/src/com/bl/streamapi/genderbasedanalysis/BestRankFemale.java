package com.bl.streamapi.genderbasedanalysis;
import java.util.*;

public class BestRankFemale {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A","Male",22,5),
                new Student("B","Female",21,4),
                new Student("C","Female",23,1)
        );

        list.stream()
            .filter(s -> s.getGender().equalsIgnoreCase("Female"))
            .min(Comparator.comparing(Student::getRank))
            .ifPresent(System.out::println);
    }
}
