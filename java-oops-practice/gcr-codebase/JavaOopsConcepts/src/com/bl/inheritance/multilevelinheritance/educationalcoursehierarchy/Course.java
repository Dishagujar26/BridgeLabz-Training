package com.bl.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class Course {
	
	String courseName;
	int duration;
	
	public Course(String courseName, int duration) {
		super();
		this.courseName = courseName;
		this.duration = duration;
	}
	
	void getCourseDetails() {
		System.out.println("Course name: "+ courseName);
		System.out.println("Course duration: "+ duration+" months");
	}
	

}
