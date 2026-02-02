package com.bl.realtimescenariobased;

import java.util.List;

import com.bl.realtimescenariobased.model.Employee;
import com.bl.realtimescenariobased.model.EmployeeData;
import com.bl.realtimescenariobased.queries.DepartmentQueries;
import com.bl.realtimescenariobased.queries.GenderQueries;
import com.bl.realtimescenariobased.queries.SalaryQueries;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        GenderQueries.countByGender(employees);
        DepartmentQueries.departments(employees);
        SalaryQueries.highestPaid(employees);
    }
}
