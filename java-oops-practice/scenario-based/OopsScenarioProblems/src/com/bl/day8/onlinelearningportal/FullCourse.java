package com.bl.day8.onlinelearningportal;

public class FullCourse extends Course {
	public FullCourse(String courseName) {
		super(courseName);
	}

	@Override
	public void generateCertificate(Learner learner) {
		System.out.println("Full-Time Course Certificate Generated");
		System.out.println("Course: " + courseName);
		System.out.println("Learner: " + learner.getName());
		System.out.println("Final Score: " + learner.getQuizPercentage() + "%");
	}

}
