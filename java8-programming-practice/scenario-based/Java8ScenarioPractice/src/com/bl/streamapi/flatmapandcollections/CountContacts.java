package com.bl.streamapi.flatmapandcollections;
import java.util.*;

public class CountContacts {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Amit", List.of("111","222")),
                new Student("Riya", List.of("333")),
                new Student("Neha", List.of("444","555"))
        );

        long count =
                list.stream()
                    .flatMap(s -> s.getContacts().stream())
                    .count();

        System.out.println(count);
    }
}
