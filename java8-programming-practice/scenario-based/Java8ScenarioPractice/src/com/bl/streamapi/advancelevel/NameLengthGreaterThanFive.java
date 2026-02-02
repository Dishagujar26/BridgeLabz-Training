package com.bl.streamapi.advancelevel;
import java.util.*;

public class NameLengthGreaterThanFive {
    public static void main(String[] args) {
        List<Student> list = List.of(
            new Student(1,"Suresh","CS",10),
            new Student(2,"Riya","IT",15)
        );

        list.stream()
            .filter(s -> s.getName().length() > 5)
            .forEach(System.out::println);
    }
}
