package com.bl.streamapi.genderbasedanalysis;
import java.util.*;
import java.util.stream.*;

public class AvgAgeMale {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A","Male",22,5),
                new Student("B","Female",21,8),
                new Student("C","Male",26,3)
        );

        double avg =
                list.stream()
                    .filter(s -> s.getGender().equalsIgnoreCase("Male"))
                    .collect(Collectors.averagingInt(Student::getAge));

        System.out.println(avg);
    }
}
