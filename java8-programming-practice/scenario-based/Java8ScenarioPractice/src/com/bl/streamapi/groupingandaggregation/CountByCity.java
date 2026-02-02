package com.bl.streamapi.groupingandaggregation;
import java.util.*;
import java.util.stream.*;

public class CountByCity {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A","IT","Pune",22,10,"Male"),
                new Student("B","IT","Mumbai",23,15,"Female"),
                new Student("C","Mech","Pune",21,20,"Male")
        );

        Map<String, Long> result =
                list.stream()
                    .collect(Collectors.groupingBy(
                            Student::getCity,
                            Collectors.counting()));

        System.out.println(result);
    }
}
