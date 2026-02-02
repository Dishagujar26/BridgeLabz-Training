package com.bl.streamapi.departmentspecificqueries;
public class Student {
    private String name;
    private String department;
    private int age;
    private int rank;
    private String state;

    public Student(String name, String department, int age, int rank, String state) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.rank = rank;
        this.state = state;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getAge() { return age; }
    public int getRank() { return rank; }
    public String getState() { return state; }

    @Override
    public String toString() {
        return name + " | " + department + " | Age:" + age + " | Rank:" + rank + " | " + state;
    }
}
