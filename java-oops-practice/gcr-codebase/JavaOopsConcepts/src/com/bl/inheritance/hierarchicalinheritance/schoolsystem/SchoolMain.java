package com.bl.inheritance.hierarchicalinheritance.schoolsystem;

public class SchoolMain {

	public static void main(String[] args) {
		Teacher t = new Teacher("Mr. Sharma", 40, "Maths");
		Student s = new Student("Aditi", 16, 10);
		Staff st = new Staff("Ramesh", 35, "Administration");

		t.displayRole();
		s.displayRole();
		st.displayRole();
	}

}
