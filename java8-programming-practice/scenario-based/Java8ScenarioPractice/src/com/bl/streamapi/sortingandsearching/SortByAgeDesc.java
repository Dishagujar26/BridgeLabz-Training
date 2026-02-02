package com.bl.streamapi.sortingandsearching;
import java.util.*;

public class SortByAgeDesc {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Kiran",10,24),
                new Student("Pooja",8,21),
                new Student("Vikas",15,26)
        );

        list.stream()
            .sorted(Comparator.comparing(Student::getAge).reversed())
            .forEach(System.out::println);
    }
}
