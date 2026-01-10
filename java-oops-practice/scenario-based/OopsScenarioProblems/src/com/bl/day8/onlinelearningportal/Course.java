package com.bl.day8.onlinelearningportal;

public abstract class Course {
	 protected String courseName;

	    public Course(String courseName) {
	        this.courseName = courseName;
	    }

	    public abstract void generateCertificate(Learner learner);
}
