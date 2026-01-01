package com.bl.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class OnlineCourse extends Course{
	
	
	String platform;
	boolean isRecorded;

	public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
		super(courseName, duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}
	
	@Override
	void getCourseDetails() {
		super.getCourseDetails();
		System.out.println("Course platform: "+ platform);	
		System.out.println("is the course recoreded: "+ isRecorded);	
	}
}
