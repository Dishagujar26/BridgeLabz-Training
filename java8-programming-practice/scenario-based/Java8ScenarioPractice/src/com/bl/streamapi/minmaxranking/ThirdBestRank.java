package com.bl.streamapi.minmaxranking;
import java.util.*;

public class ThirdBestRank {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A",1,22),
                new Student("B",2,21),
                new Student("C",3,20),
                new Student("D",4,23)
        );

        list.stream()
            .sorted(Comparator.comparing(Student::getRank))
            .skip(2)
            .findFirst()
            .ifPresent(System.out::println);
    }
}
