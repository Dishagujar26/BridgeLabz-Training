package com.bl.objectmodeling.selfproblems.problem1;

import java.util.ArrayList;
import java.util.List;

public class Course {

	String courseName;
	
	// Course can have many Students
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}




