package com.bl.lambdaexpression.scenario1;

import java.util.Arrays;
import java.util.List;

public class StudentLambda {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Alice", 85, 2, 19), new Student("Bob", 65, 1, 17),
				new Student("Charlie", 90, 3, 20));

		// 1. Welcome message
		Runnable welcome = () -> System.out.println("Welcome Students!");
		welcome.run();

		// 2. Pass or fail based on marks
		students.forEach(s -> System.out.println(s.name + " Pass? " + (s.marks >= 40)));

		// 3. Sort by name
		students.sort((s1, s2) -> s1.name.compareTo(s2.name));
		System.out.println("Sorted by name: " + students);

		// 4. Sort by rank
		students.sort((s1, s2) -> Integer.compare(s1.rank, s2.rank));
		System.out.println("Sorted by rank: " + students);

		// 5. Students with age > 18
		students.stream().filter(s -> s.age > 18).forEach(System.out::println);
	}
}