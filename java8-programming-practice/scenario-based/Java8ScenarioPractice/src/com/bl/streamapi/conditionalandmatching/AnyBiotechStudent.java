package com.bl.streamapi.conditionalandmatching;
import java.util.*;

public class AnyBiotechStudent {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A","IT",22),
                new Student("B","Biotech",21),
                new Student("C","Mech",23)
        );

        boolean exists =
                list.stream()
                    .anyMatch(s -> s.getDepartment().equalsIgnoreCase("Biotech"));

        System.out.println(exists);
    }
}
