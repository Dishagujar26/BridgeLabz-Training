package com.bl.conversions.objectcollection;
import java.util.*;
import java.util.stream.*;

public class EmpDeptSet {
    public static void main(String[] args) {
        List<Employee> list = List.of(
            new Employee(1,"A","IT",50000),
            new Employee(2,"B","HR",40000)
        );

        Set<String> depts =
                list.stream()
                    .map(Employee::getDept)
                    .collect(Collectors.toSet());

        System.out.println(depts);
    }
}
