package com.bl.streamapi.sortingandsearching;
import java.util.*;

public class Top5ByRank {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A",1,20),
                new Student("B",2,21),
                new Student("C",3,22),
                new Student("D",4,23),
                new Student("E",5,24),
                new Student("F",6,25)
        );

        list.stream()
            .sorted(Comparator.comparing(Student::getRank))
            .limit(5)
            .forEach(System.out::println);
    }
}
