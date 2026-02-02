package com.bl.streamapi.genderbasedanalysis;
import java.util.*;
import java.util.stream.*;

public class CountByGender {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A","Male",22,5),
                new Student("B","Female",21,8),
                new Student("C","Male",23,3)
        );

        Map<String, Long> result =
                list.stream()
                    .collect(Collectors.groupingBy(
                            Student::getGender,
                            Collectors.counting()));

        System.out.println(result);
    }
}
