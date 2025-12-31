package com.bl.objectmodeling.selfproblems.problem1;

import java.util.ArrayList;

public class Student {
	String name;
	// students can have many courses 
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // communication
    }

    void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
}
