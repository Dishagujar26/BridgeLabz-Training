package com.bl.optionalclass.scenario1;

import java.util.*;

public class StudentOptionalDemo {
	public static void main(String[] args) {
		Student s1 = new Student("Alice", null, null, null, "123 Main St");
		Student s2 = new Student("Bob", "Bobby", "bob@example.com", "555-1234", null);

		// 1. Fetch email safely
		String email1 = s1.getEmail().orElse("No Email");
		System.out.println("Email of Alice: " + email1);

		// 2. Fetch phone safely with default
		String phone = s1.getPhone().orElse("000-0000");
		System.out.println("Phone of Alice: " + phone);

		// 3. Find student by ID (simulate missing student)
		Optional<Student> studentOpt = Optional.empty(); // assume not found
		Student student = studentOpt.orElseGet(() -> new Student("NA", null, null, null, null));
		System.out.println("Found student: " + student.name);

		// 4. Fetch address safely
		String addr = s2.getAddress().orElse("Address not available");
		System.out.println("Address of Bob: " + addr);

		// 5. Return nickname if present, otherwise real name
		String displayName = s2.getNickname().orElse(s2.name);
		System.out.println("Display name of Bob: " + displayName);
	}
}
