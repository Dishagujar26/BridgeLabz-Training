package com.bl.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class CourseMain {
	
	public static void main(String []args) {
		Course course = new PaidOnlineCourse("Java Programming",3,"YouTube",true,7800.00,5);
		course.getCourseDetails();
		
	}

}
