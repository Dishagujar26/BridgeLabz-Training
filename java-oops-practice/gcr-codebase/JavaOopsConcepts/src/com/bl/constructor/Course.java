package com.bl.constructor;

public class Course {
	
    String courseName;
    int duration; 
    double fee;

    static String instituteName = "BridgeLabz";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println();
    }

    // class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

}
