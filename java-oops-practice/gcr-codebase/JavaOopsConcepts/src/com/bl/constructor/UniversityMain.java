package com.bl.constructor;

public class UniversityMain {
	
	public static void main(String[] args) {

        PostgraduateStudent pg = new PostgraduateStudent(101, "Disha", 8.6, "Computer Science");

        pg.displayPGStudent();
        pg.setCGPA(9.1);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
