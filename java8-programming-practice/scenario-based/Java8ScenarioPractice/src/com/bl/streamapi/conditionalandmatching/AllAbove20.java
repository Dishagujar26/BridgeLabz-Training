package com.bl.streamapi.conditionalandmatching;
import java.util.*;

public class AllAbove20 {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A","IT",22),
                new Student("B","Mech",25),
                new Student("C","Civil",19)
        );

        boolean result =
                list.stream()
                    .allMatch(s -> s.getAge() > 20);

        System.out.println(result);
    }
}
