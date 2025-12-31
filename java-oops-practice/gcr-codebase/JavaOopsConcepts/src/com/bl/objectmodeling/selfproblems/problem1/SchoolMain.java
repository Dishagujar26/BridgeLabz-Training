package com.bl.objectmodeling.selfproblems.problem1;

public class SchoolMain {

	public static void main(String[] args) {
		
		// aggregation - School HAS Students, Association -> Student <-> Course (Many-to-Many)

		School school = new School("Green Valley School");

		Student s1 = new Student("Disha");
		Student s2 = new Student("Aman");

		Course c1 = new Course("Math");
		Course c2 = new Course("Science");

		school.addStudent(s1);
		school.addStudent(s2);

		s1.enrollCourse(c1);
		s1.enrollCourse(c2);

		s2.enrollCourse(c1);

		s1.showCourses();
		c1.showStudents();
	}
}
