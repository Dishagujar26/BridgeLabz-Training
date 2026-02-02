package com.bl.conversions.objectcollection;
import java.util.*;
import java.util.stream.*;

public class EmpGroupByDept {
    public static void main(String[] args) {
        List<Employee> list = List.of(
            new Employee(1,"A","IT",50000),
            new Employee(2,"B","IT",60000),
            new Employee(3,"C","HR",40000)
        );

        Map<String, List<Employee>> map =
                list.stream()
                    .collect(Collectors.groupingBy(Employee::getDept));

        System.out.println(map);
    }
}
