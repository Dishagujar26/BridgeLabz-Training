package com.bl.optionalclass.scenario2;

import java.util.Optional;

public class Employee {
    String name;
    Employee manager;
    Double bonus;
    String email;
    String insurance;
    String middleName;

    Employee(String name, Employee manager, Double bonus, String email, String insurance, String middleName) {
        this.name = name;
        this.manager = manager;
        this.bonus = bonus;
        this.email = email;
        this.insurance = insurance;
        this.middleName = middleName;
    }

    Optional<Employee> getManager() { return Optional.ofNullable(manager); }
    Optional<Double> getBonus() { return Optional.ofNullable(bonus); }
    Optional<String> getEmail() { return Optional.ofNullable(email); }
    Optional<String> getInsurance() { return Optional.ofNullable(insurance); }
    Optional<String> getMiddleName() { return Optional.ofNullable(middleName); }
}