package com.bl.day2.universitycourseenrollmentsystem;

public class UniversityMain {
	public static void main(String[] args){

		Student s1 = new Undergraduate(1, "Rahul");
		Student s2 = new Postgraduate(2, "Anita", 8.2);

		Course c1 = new Course(101, "Data Structures");
		Faculty f1 = new Faculty("Dr. Sharma");

		Enrollment e1 = new Enrollment(s1, c1);
		e1.assignGrade(9.0);

		System.out.println(s1.getTranscript());
		System.out.println(s2.getTranscript());
	}
}
