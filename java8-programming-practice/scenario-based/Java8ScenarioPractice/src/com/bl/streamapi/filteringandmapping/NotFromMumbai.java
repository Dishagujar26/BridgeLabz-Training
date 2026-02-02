package com.bl.streamapi.filteringandmapping;
import java.util.*;

public class NotFromMumbai {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Vikas",12,24,"Civil","Mumbai"),
                new Student("Pooja",19,23,"Mechanical","Pune")
        );

        list.stream()
            .filter(s -> !s.getCity().equalsIgnoreCase("Mumbai"))
            .forEach(System.out::println);
    }
}
