package com.bl.day8.onlinelearningportal;

public class ShortCourse extends Course {
	public ShortCourse(String courseName) {
		super(courseName);
	}

	@Override
	public void generateCertificate(Learner learner) {
		System.out.println("Short Course Certificate Generated");
		System.out.println("Course: " + courseName);
		System.out.println("Learner: " + learner.getName());
	}

}
