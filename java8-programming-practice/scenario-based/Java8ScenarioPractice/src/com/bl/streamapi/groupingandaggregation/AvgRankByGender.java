package com.bl.streamapi.groupingandaggregation;
import java.util.*;
import java.util.stream.*;

public class AvgRankByGender {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A","IT","Pune",22,10,"Male"),
                new Student("B","IT","Mumbai",23,20,"Female"),
                new Student("C","Mech","Pune",21,30,"Male")
        );

        Map<String, Double> result =
                list.stream()
                    .collect(Collectors.groupingBy(
                            Student::getGender,
                            Collectors.averagingInt(Student::getRank)));

        System.out.println(result);
    }
}
