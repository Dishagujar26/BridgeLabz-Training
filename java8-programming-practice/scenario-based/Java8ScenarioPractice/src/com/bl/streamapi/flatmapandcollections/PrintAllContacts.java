package com.bl.streamapi.flatmapandcollections;
import java.util.*;

public class PrintAllContacts {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Amit", List.of("111","222")),
                new Student("Riya", List.of("333")),
                new Student("Neha", List.of("444","555"))
        );

        list.stream()
            .flatMap(s -> s.getContacts().stream())
            .forEach(System.out::println);
    }
}
