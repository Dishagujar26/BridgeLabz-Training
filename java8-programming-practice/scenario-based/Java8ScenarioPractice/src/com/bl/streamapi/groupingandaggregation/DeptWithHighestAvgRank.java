package com.bl.streamapi.groupingandaggregation;
import java.util.*;
import java.util.stream.*;

public class DeptWithHighestAvgRank {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A","IT","Pune",22,10,"Male"),
                new Student("B","IT","Mumbai",23,20,"Female"),
                new Student("C","Mech","Pune",21,5,"Male")
        );

        String department =
                list.stream()
                    .collect(Collectors.groupingBy(
                            Student::getDepartment,
                            Collectors.averagingInt(Student::getRank)))
                    .entrySet()
                    .stream()
                    .min(Map.Entry.comparingByValue())
                    .map(Map.Entry::getKey)
                    .orElse("N/A");

        System.out.println(department);
    }
}
