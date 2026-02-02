package com.bl.streamapi.filteringandmapping;
import java.util.*;

public class RankLessThan50 {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Amit",45,22,"Mechanical","Pune"),
                new Student("Ravi",60,24,"IT","Mumbai")
        );

        list.stream()
            .filter(s -> s.getRank() < 50)
            .forEach(System.out::println);
    }
}
