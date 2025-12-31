package com.bl.objectmodeling.assistedproblems.problem3;

public class Employee {
	
	String name;
    Employee(String name) {
        this.name = name;
    }

    void showEmployee() {
        System.out.println("Employee: " + name);
    }

}
