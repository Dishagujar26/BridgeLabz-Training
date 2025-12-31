package com.bl.objectmodeling.selfproblems.problem5;

import java.util.ArrayList;

public class Professor {
	String name;
    ArrayList<Course> courses = new ArrayList<>();

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this); // communication
        System.out.println(name + " assigned to " + course.courseName);
    }

}
