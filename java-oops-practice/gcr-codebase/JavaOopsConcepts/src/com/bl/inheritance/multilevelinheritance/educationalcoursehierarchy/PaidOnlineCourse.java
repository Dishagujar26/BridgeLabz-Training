package com.bl.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class PaidOnlineCourse extends OnlineCourse{
	double fee;
	int discount;
	
	public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee,
			int discount) {
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}

	@Override
	void getCourseDetails() {
		super.getCourseDetails();	
		System.out.println("Course fee: "+ fee);	
		System.out.println("Discount applied: "+ discount+" %");	
	}
}
