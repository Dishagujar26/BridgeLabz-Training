package com.bl.streamapi.groupingandaggregation;
public class Student {
    private String name;
    private String department;
    private String city;
    private int age;
    private int rank;
    private String gender;

    public Student(String name, String department, String city, int age, int rank, String gender) {
        this.name = name;
        this.department = department;
        this.city = city;
        this.age = age;
        this.rank = rank;
        this.gender = gender;
    }

    public String getDepartment() { return department; }
    public String getCity() { return city; }
    public int getAge() { return age; }
    public int getRank() { return rank; }
    public String getGender() { return gender; }

    @Override
    public String toString() {
        return name + " | " + department + " | " + city + " | " + age + " | " + rank + " | " + gender;
    }
}
