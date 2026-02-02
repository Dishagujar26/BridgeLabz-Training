package com.bl.streamapi.minmaxranking;
import java.util.*;

public class YoungestStudent {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A",5,22),
                new Student("B",1,18),
                new Student("C",3,21)
        );

        list.stream()
            .min(Comparator.comparing(Student::getAge))
            .ifPresent(System.out::println);
    }
}
