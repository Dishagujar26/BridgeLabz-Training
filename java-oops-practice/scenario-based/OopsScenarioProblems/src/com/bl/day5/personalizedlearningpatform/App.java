package com.bl.day5.personalizedlearningpatform;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		String[] questions = { "1. Java is platform independent?", "2. JVM converts bytecode to machine code?",
				"3. Does Java use pointers?", "4. Can the main method be overloaded?",
				"5. Is it mandatory for a catch block to follow try?" };

		String[] answers = { "yes", "yes", "no", "yes", "yes" };
		String[] shortCourses = { "Java Basics", "OOP Fundamentals", "DSA Crash Course" };

		String[] fullCourses = { "Full Stack Java", "Java + Spring Boot", "Backend Developer Program" };

		while (true) {
			System.out.println("Who are you?\n1. Learner\n2. Instructor\n3. Exit");
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {

				System.out.print("Enter your name: ");
				String name = sc.nextLine();

				System.out.print("Enter your email: ");
				String email = sc.nextLine();

				System.out.print("Enter your ID: ");
				int id = sc.nextInt();

				Learner learner = new Learner(name, email, id);

				System.out.println("\nWhat do you want to do?");
				System.out.println("1. Play Quiz");
				System.out.println("2. Enroll to Course");
				System.out.println("3. Exit");
				choice = sc.nextInt();

				if (choice == 1) {

					System.out.println("Select difficulty\n1. Easy\n2. Hard");
					int diff = sc.nextInt();

					Quiz quiz;
					if (diff == 1) {
						quiz = new Quiz(questions, answers, "easy");
					} else {
						quiz = new Quiz(questions, answers, "hard");
					}

					String[] learnerAnswers = new String[questions.length];
					sc.nextLine(); // consume newline

					for (int i = 0; i < questions.length; i++) {
						System.out.print(questions[i] + " ");
						learnerAnswers[i] = sc.nextLine();
					}

					quiz.evaluateQuiz(learnerAnswers);
					double percentage = quiz.calculatePercentage();
					learner.setQuizPercentage(percentage);

					System.out.println("Quiz Completed!");
					System.out.println("Your Score: " + percentage + "%");
				}

				else if (choice == 2) {

					System.out.println("Select Course Type");
					System.out.println("1. Short Course");
					System.out.println("2. Full-Time Course");
					choice = sc.nextInt();

					Course course = null;

					if (choice == 1) {
						System.out.println("Available Short Courses:");
						for (int i = 0; i < shortCourses.length; i++) {
							System.out.println((i + 1) + ". " + shortCourses[i]);
						}

						System.out.print("Select course: ");
						int courseChoice = sc.nextInt();
						sc.nextLine();

						course = new ShortCourse(shortCourses[courseChoice - 1]);
					} else if (choice == 2) {
						System.out.println("Available Full-Time Courses:");
						for (int i = 0; i < fullCourses.length; i++) {
							System.out.println((i + 1) + ". " + fullCourses[i]);
						}

						System.out.print("Select course: ");
						int courseChoice = sc.nextInt();
						sc.nextLine();

						course = new FullCourse(fullCourses[courseChoice - 1]);
					}

					course.generateCertificate(learner);
				}

				else {
					System.out.println("Thank you for using EduMentor!");
					break;
				}
			}

			else if (choice == 2) {

//				sc.nextLine(); // new line consume

				System.out.print("Enter Instructor name: ");
				String name = sc.nextLine();

				System.out.print("Enter email: ");
				String email = sc.nextLine();

				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter department: ");
				String dept = sc.nextLine();

				Instructor instructor = new Instructor(name, email, id, dept);

				System.out.println("\nWelcome Instructor " + name);

				System.out.println("What do you want to do?");
				System.out.println("1. Create Quiz");
				System.out.println("2. View Quiz");
				System.out.println("3. Exit");

				int instChoice = sc.nextInt();
				sc.nextLine();

				if (instChoice == 1) {
					System.out.println("Quiz created successfully");
					// not creating any quiz as of now
				} else if (instChoice == 2) {
					System.out.println("Existing Quiz Questions:");
					for (String q : questions) {
						System.out.println(q);
					}
				} else {
					System.out.println("Logging " + name + " out!!");
				}
			} else if (choice == 3) {
				System.out.println("Thank you for using EduMentor!");
				break;
			} else {
				System.out.println("Invalid choice!!");
			}
			
		}
		sc.close();
	}
}
