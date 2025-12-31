package com.bl.objectmodeling.selfproblems.problem5;

import java.util.ArrayList;

public class University {
	
	// Association -> Student <--> Course (many-to-many)
	// Association → Professor ↔ Course (many-to-many)
	/// Aggregation → University HAS Students / Professors

	String universityName;
	ArrayList<Student> students = new ArrayList<>();
	ArrayList<Professor> professors = new ArrayList<>();

	University(String universityName) {
		this.universityName = universityName;
	}

	void addStudent(Student student) {
		students.add(student);
	}

	void addProfessor(Professor professor) {
		professors.add(professor);
	}

}
