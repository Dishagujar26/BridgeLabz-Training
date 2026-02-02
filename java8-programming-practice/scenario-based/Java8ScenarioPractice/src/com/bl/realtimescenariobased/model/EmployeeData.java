package com.bl.realtimescenariobased.model;

import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {
        return List.of(
            new Employee(1,"Amit",30,"Male","IT",2018,60000),
            new Employee(2,"Neha",25,"Female","Sales",2020,40000),
            new Employee(3,"Rahul",40,"Male","Product",2012,90000),
            new Employee(4,"Sneha",28,"Female","Product",2021,50000)
        );
    }
}
