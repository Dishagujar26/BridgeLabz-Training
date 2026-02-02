package com.bl.streamapi.groupingandaggregation;
import java.util.*;
import java.util.stream.*;

public class AvgAgeByDepartment {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A","IT","Pune",22,10,"Male"),
                new Student("B","IT","Mumbai",26,15,"Female"),
                new Student("C","Mech","Pune",20,20,"Male")
        );

        Map<String, Double> result =
                list.stream()
                    .collect(Collectors.groupingBy(
                            Student::getDepartment,
                            Collectors.averagingInt(Student::getAge)));

        System.out.println(result);
    }
}
