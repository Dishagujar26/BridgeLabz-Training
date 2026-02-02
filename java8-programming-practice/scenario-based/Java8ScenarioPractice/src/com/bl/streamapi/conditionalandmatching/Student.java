package com.bl.streamapi.conditionalandmatching;
public class Student {
    private String name;
    private String department;
    private int age;

    public Student(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public String getDepartment() { return department; }
    public int getAge() { return age; }
}
