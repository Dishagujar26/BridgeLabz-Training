package com.bl.day2.universitycourseenrollmentsystem;

public class Student {
	private int id;
    private String name;
    private double gpa;

    Student(int id, String name) {         
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, double gpa) { 
        this(id, name);
        this.gpa = gpa;
    }

    protected void updateGPA(double totalPoints, int subjects) {
        this.gpa = totalPoints / subjects;
    }

    public String getTranscript() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa;
    }
}
