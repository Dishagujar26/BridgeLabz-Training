package com.bl.lambdaexpression.scenario2;
import java.util.Arrays;
import java.util.List;

public class EmployeeLambda {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John",35000,4),
                new Employee("Jane",28000,2),
                new Employee("Mike",40000,5)
        );

        // 1. Calculate bonus if salary > 30000
        employees.forEach(e -> {
            double bonus = e.salary>30000 ? e.salary*0.1 : 0;
            System.out.println(e.name+" Bonus: "+bonus);
        });

        // 2. Sort by salary
        employees.sort((e1,e2) -> Double.compare(e1.salary,e2.salary));
        System.out.println("Sorted by salary: " + employees);

        // 3. Promotion eligibility (experience >3)
        employees.forEach(e -> System.out.println(e.name+" eligible? "+(e.exp>3)));

        // 4. Print employee details
        employees.forEach(System.out::println);

        // 5. Compare salaries of two employees
        System.out.println("Compare John & Jane: " + Double.compare(employees.get(0).salary, employees.get(1).salary));
    }
}
