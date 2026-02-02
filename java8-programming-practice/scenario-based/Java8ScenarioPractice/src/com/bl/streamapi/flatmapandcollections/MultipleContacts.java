package com.bl.streamapi.flatmapandcollections;
import java.util.*;

public class MultipleContacts {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Amit", List.of("111","222")),
                new Student("Riya", List.of("333")),
                new Student("Neha", List.of("444","555"))
        );

        list.stream()
            .filter(s -> s.getContacts().size() > 1)
            .forEach(s -> System.out.println(s.getName()));
    }
}
