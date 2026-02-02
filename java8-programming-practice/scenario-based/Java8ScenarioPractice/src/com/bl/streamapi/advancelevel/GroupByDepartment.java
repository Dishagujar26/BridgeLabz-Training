package com.bl.streamapi.advancelevel;
import java.util.*;
import java.util.stream.*;

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Student> list = List.of(
            new Student(1,"Sam","CS",10),
            new Student(2,"Riya","IT",15),
            new Student(3,"Sonal","CS",5)
        );

        Map<String, List<Student>> map =
                list.stream()
                    .collect(Collectors.groupingBy(Student::getDepartment));

        System.out.println(map);
    }
}
