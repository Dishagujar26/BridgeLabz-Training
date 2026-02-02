package com.bl.functionalinterfaces.comparator;

import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        // 1. Compare students by rank
        Comparator<Student> studentComp = Comparator.comparingInt(s -> s.rank);
        List<Student> students = List.of(new Student("Alice",2), new Student("Bob",1));
        students.stream().sorted(studentComp).forEach(s -> System.out.println(s.name));

        // 2. Compare employees by salary
        Comparator<Employee> empComp = Comparator.comparingDouble(e -> e.salary);
        List<Employee> emps = List.of(new Employee("X",5000), new Employee("Y",7000));
        emps.stream().sorted(empComp).forEach(e -> System.out.println(e.name));

        // 3. Compare products by price
        Comparator<Double> priceComp = Double::compare;
        System.out.println(priceComp.compare(50.0, 30.0));

        // 4. Compare strings by length
        Comparator<String> lenComp = Comparator.comparingInt(String::length);
        System.out.println(lenComp.compare("Java","Spring"));

        // 5. Compare bank accounts by balance
        Comparator<Double> balComp = Double::compare;
        System.out.println(balComp.compare(1500.0, 2000.0));
    }
}