package com.bl.constructor;

public class Student {
	
    public int rollNumber;        
    protected String name;        
    private double cgpa;         

    // Constructor
    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public methods to access private CGPA
    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

}
class PostgraduateStudent extends Student {

    String specialization;

    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        // calling parent class constructor
    	super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    void displayPGStudent() {
        System.out.println("Roll No: " + rollNumber);   
        System.out.println("Name: " + name);          
        System.out.println("CGPA: " + getCGPA());       
        System.out.println("Specialization: " + specialization);
    }
}
