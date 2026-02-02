package com.bl.streamapi.advancelevel;
import java.util.*;

public class OddRankStudents {
    public static void main(String[] args) {
        List<Student> list = List.of(
            new Student(1,"Sam","CS",10),
            new Student(2,"Riya","IT",15)
        );

        list.stream()
            .filter(s -> s.getRank() % 2 != 0)
            .forEach(System.out::println);
    }
}
