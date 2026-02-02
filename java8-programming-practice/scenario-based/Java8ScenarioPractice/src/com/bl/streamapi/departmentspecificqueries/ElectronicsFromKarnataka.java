package com.bl.streamapi.departmentspecificqueries;
import java.util.*;

public class ElectronicsFromKarnataka {
    public static void main(String[] args) {
        List<Student> list = List.of(
            new Student("A","Electronics",22,5,"KA"),
            new Student("B","Electronics",21,8,"MH"),
            new Student("C","Electronics",23,3,"KA")
        );

        long count =
                list.stream()
                    .filter(s -> s.getDepartment().equalsIgnoreCase("Electronics"))
                    .filter(s -> s.getState().equalsIgnoreCase("KA"))
                    .count();

        System.out.println(count);
    }
}
