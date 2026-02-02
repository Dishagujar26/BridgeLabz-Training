package com.bl.streamapi.flatmapandcollections;
import java.util.List;

public class Student {
    private String name;
    private List<String> contacts;

    public Student(String name, List<String> contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    public String getName() { return name; }
    public List<String> getContacts() { return contacts; }

    @Override
    public String toString() {
        return name + " " + contacts;
    }
}
