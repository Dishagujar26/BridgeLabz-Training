package com.bl.streamapi.sortingandsearching;
import java.util.*;

public class SortByNameThenRank {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Amit",10,22),
                new Student("Amit",5,21),
                new Student("Ravi",8,23)
        );

        list.stream()
            .sorted(Comparator.comparing(Student::getName)
                              .thenComparing(Student::getRank))
            .forEach(System.out::println);
    }
}
