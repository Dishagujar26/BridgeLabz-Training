package com.bl.streamapi.minmaxranking;
import java.util.*;

public class WorstRank {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A",5,22),
                new Student("B",1,20),
                new Student("C",10,21)
        );

        list.stream()
            .max(Comparator.comparing(Student::getRank))
            .ifPresent(System.out::println);
    }
}
