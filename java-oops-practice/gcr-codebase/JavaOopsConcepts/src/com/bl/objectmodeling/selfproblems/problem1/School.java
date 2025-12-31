package com.bl.objectmodeling.selfproblems.problem1;

import java.util.ArrayList;

public class School {
	String schoolName;
	// school can have many students 
    ArrayList<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }

}
