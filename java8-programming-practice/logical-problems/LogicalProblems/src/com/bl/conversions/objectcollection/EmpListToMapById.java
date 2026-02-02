package com.bl.conversions.objectcollection;
import java.util.*;
import java.util.stream.*;

public class EmpListToMapById {
    public static void main(String[] args) {
        List<Employee> list = List.of(
            new Employee(1,"A","IT",50000),
            new Employee(2,"B","HR",40000)
        );

        Map<Integer, Employee> map =
                list.stream()
                    .collect(Collectors.toMap(Employee::getId, e -> e));

        System.out.println(map);
    }
}
