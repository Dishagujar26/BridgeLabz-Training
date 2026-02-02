package com.bl.streamapi.minmaxranking;
public class Student {
    private String name;
    private int rank;
    private int age;

    public Student(String name, int rank, int age) {
        this.name = name;
        this.rank = rank;
        this.age = age;
    }

    public int getRank() { return rank; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return name + " | Rank:" + rank + " | Age:" + age;
    }
}
