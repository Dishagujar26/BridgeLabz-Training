package com.bl.day4.collegeinformationsystem;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements ICourseActions{
	 private List<Integer> grades = new ArrayList<>();
	 private List<Course> courses = new ArrayList<>();

	 Student(int id, String name, String email) {
	     super(id, name, email);
	 }

	 public void addGrade(int grade) {
	     grades.add(grade);
	 }

	 // Operator usage for GPA calculation
	 public double calculateGPA() {
	     int sum = 0;
	     for (int g : grades) sum += g;
	     return grades.size() == 0 ? 0 : (double) sum / grades.size();
	 }

	 public void enrollCourse(Course course) {
	     courses.add(course);
	     course.addStudent(this);
	 }

	 public void dropCourse(Course course) {
	     courses.remove(course);
	     course.removeStudent(this);
	 }

	 void printDetails() {
	     System.out.println("Student: " + name + ", GPA: " + calculateGPA());
	 }

}
