package com.bl.generics.resumescreeningsystem;

public class ResumeScreeningUtil {

	public static <T extends JobRole> void screenResume(Resume<T> resume) {
		System.out.println(resume.getDetails());

		if (resume.isEligible()) {
			System.out.println("Status: Shortlisted\n");
		} else {
			System.out.println("Status: Rejected\n");
		}
	}
}
