package com.bl.streamapi.genderbasedanalysis;
public class Student {
    private String name;
    private String gender;
    private int age;
    private int rank;

    public Student(String name, String gender, int age, int rank) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.rank = rank;
    }

    public String getGender() { return gender; }
    public int getAge() { return age; }
    public int getRank() { return rank; }

    @Override
    public String toString() {
        return name + " | " + gender + " | Age:" + age + " | Rank:" + rank;
    }
}
