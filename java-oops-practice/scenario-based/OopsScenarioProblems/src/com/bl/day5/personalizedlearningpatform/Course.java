package com.bl.day5.personalizedlearningpatform;

public abstract class Course {
	 protected String courseName;

	    public Course(String courseName) {
	        this.courseName = courseName;
	    }

	    public abstract void generateCertificate(Learner learner);
}
