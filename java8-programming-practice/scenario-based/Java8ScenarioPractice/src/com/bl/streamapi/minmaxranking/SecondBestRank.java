package com.bl.streamapi.minmaxranking;
import java.util.*;

public class SecondBestRank {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A",1,22),
                new Student("B",2,21),
                new Student("C",3,20)
        );

        list.stream()
            .sorted(Comparator.comparing(Student::getRank))
            .skip(1)
            .findFirst()
            .ifPresent(System.out::println);
    }
}
