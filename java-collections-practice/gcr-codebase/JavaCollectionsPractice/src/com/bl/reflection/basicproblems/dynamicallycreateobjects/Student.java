package com.bl.reflection.basicproblems.dynamicallycreateobjects;
class Student {
    String name;
    int roll;

    public Student() {
        this.name = "Default Student";
        this.roll = 1;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', roll=" + roll + "}";
    }
}