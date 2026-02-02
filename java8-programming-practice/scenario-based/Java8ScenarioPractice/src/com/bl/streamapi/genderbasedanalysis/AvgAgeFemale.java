package com.bl.streamapi.genderbasedanalysis;
import java.util.*;
import java.util.stream.*;

public class AvgAgeFemale {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A","Male",22,5),
                new Student("B","Female",24,8),
                new Student("C","Female",20,3)
        );

        double avg =
                list.stream()
                    .filter(s -> s.getGender().equalsIgnoreCase("Female"))
                    .collect(Collectors.averagingInt(Student::getAge));

        System.out.println(avg);
    }
}
