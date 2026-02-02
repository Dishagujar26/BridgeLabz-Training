package com.bl.streamapi.flatmapandcollections;
import java.util.*;

public class UniqueContacts {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Amit", List.of("111","222")),
                new Student("Riya", List.of("222","333")),
                new Student("Neha", List.of("333","444"))
        );

        list.stream()
            .flatMap(s -> s.getContacts().stream())
            .distinct()
            .forEach(System.out::println);
    }
}
