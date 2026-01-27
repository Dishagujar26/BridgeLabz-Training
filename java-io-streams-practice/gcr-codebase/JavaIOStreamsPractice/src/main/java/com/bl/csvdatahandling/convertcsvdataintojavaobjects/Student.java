package com.bl.csvdatahandling.convertcsvdataintojavaobjects;
class Student {
    String id;
    String name;
    int age;
    String email;
    String phone;

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + email + " | " + phone;
    }
}
