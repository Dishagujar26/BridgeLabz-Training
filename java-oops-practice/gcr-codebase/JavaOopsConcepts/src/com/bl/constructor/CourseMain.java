package com.bl.constructor;

public class CourseMain {
	
	 public static void main(String[] args) {

	        Course c1 = new Course("Java Full Stack", 6, 50000);
	        Course c2 = new Course("Python", 4, 35000);

	        c1.displayCourseDetails();
	        c2.displayCourseDetails();

	        // Update institute name for all courses
	        Course.updateInstituteName("BridgeLabz Solutions");

	        c1.displayCourseDetails();
	        c2.displayCourseDetails();
	    }

}
