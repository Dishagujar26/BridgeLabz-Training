package com.bl.streamapi.advancelevel;
import java.util.*;

public class NameStartsWithS {
    public static void main(String[] args) {
        List<Student> list = List.of(
            new Student(1,"Sam","CS",10),
            new Student(2,"Riya","IT",15),
            new Student(3,"Sonal","CS",5)
        );

        list.stream()
            .filter(s -> s.getName().startsWith("S"))
            .forEach(System.out::println);
    }
}
