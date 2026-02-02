package com.bl.streamapi.conditionalandmatching;
import java.util.*;

public class NoCivilStudent {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A","IT",22),
                new Student("B","Mech",21),
                new Student("C","Civil",23)
        );

        boolean result =
                list.stream()
                    .noneMatch(s -> s.getDepartment().equalsIgnoreCase("Civil"));

        System.out.println(result);
    }
}
