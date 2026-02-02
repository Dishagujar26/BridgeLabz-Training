package com.bl.streamapi.sortingandsearching;
import java.util.*;

public class SortByRankAsc {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Amit",12,21),
                new Student("Ravi",5,23),
                new Student("Neha",20,22)
        );

        list.stream()
            .sorted(Comparator.comparing(Student::getRank))
            .forEach(System.out::println);
    }
}
