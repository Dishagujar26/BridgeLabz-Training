package com.bl.conversions.listset;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ObjectSetToNameList {
    public static void main(String[] args) {
        Set<Person> set = Set.of(new Person("A"), new Person("B"));

        List<String> names =
                set.stream()
                   .map(p -> p.name)
                   .collect(Collectors.toList());

        System.out.println(names);
    }
}