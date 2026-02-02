package com.bl.collectors.employeesalarycategorization;

class Employee {
    String department;
    double salary;

    Employee(String department, double salary) {
        this.department = department;
        this.salary = salary;
    }

    String getDepartment() { return department; }
    double getSalary() { return salary; }
}