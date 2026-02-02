package com.bl.conversions.objectcollection;
import java.util.*;
import java.util.stream.*;

public class EmpNameList {
    public static void main(String[] args) {
        List<Employee> list = List.of(
            new Employee(1,"A","IT",50000),
            new Employee(2,"B","HR",40000)
        );

        List<String> names =
                list.stream()
                    .map(Employee::getName)
                    .toList();

        System.out.println(names);
    }
}
