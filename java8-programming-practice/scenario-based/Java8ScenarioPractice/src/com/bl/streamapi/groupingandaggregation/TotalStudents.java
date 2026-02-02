package com.bl.streamapi.groupingandaggregation;
import java.util.*;

public class TotalStudents {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A","IT","Pune",22,10,"Male"),
                new Student("B","IT","Mumbai",23,15,"Female")
        );

        long total = list.stream().count();
        System.out.println(total);
    }
}
