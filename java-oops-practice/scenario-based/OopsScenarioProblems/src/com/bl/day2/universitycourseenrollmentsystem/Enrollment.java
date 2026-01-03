package com.bl.day2.universitycourseenrollmentsystem;

public class Enrollment implements Graded {

	Student student;
	Course course;
	private double grade;

	Enrollment(Student student, Course course) {
		this.student = student;
		this.course = course;
	}

	@Override
	public void assignGrade(double grade) {
		this.grade = grade;
		student.updateGPA(grade, 1);
	}

}
