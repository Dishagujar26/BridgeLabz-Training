package com.bl.streamapi.advancelevel;
import java.util.*;
import java.util.stream.*;

public class ListToIdNameMap {
    public static void main(String[] args) {
        List<Student> list = List.of(
            new Student(1,"Sam","CS",10),
            new Student(2,"Riya","IT",15)
        );

        Map<Integer, String> map =
                list.stream()
                    .collect(Collectors.toMap(
                        Student::getId,
                        Student::getName
                    ));

        System.out.println(map);
    }
}
