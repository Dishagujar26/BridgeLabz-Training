package com.bl.streamapi.sortingandsearching;
import java.util.*;

public class Last3ByRank {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A",1,20),
                new Student("B",2,21),
                new Student("C",3,22),
                new Student("D",4,23),
                new Student("E",5,24)
        );

        int size = list.size();

        list.stream()
            .sorted(Comparator.comparing(Student::getRank))
            .skip(size - 3)
            .forEach(System.out::println);
    }
}
