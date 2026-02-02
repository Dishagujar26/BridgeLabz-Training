package com.bl.streamapi.bonuschallenges;
public class Student {
    private int id;
    private String name;
    private int age;
    private int rank;
    private String department;
    private String city;

    public Student(int id, String name, int age, int rank, String department, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.department = department;
        this.city = city;
    }

    public int getAge() { return age; }
    public int getRank() { return rank; }
    public String getDepartment() { return department; }
    public String getCity() { return city; }

    @Override
    public String toString() {
        return name + " | Age:" + age + " | Rank:" + rank + " | " + department + " | " + city;
    }
}
