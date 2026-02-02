package com.bl.conversions.objectcollection;
import java.util.*;
import java.util.stream.*;

public class MapToNameList {
    public static void main(String[] args) {
        Map<Integer, Employee> map = Map.of(
            1, new Employee(1,"A","IT",50000),
            2, new Employee(2,"B","HR",40000)
        );

        List<String> names =
                map.values().stream()
                   .map(Employee::getName)
                   .toList();

        System.out.println(names);
    }
}
