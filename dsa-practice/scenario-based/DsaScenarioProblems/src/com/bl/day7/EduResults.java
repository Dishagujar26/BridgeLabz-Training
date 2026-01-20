package com.bl.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 3. EduResults – Rank Sheet Generator (Merge Sort)
Story: An educational board compiles marks of thousands of students from different districts.
Each district submits a sorted list of students by score. The main server needs to merge and
sort all these lists into a . Merge Sort ensures efficiency and maintains
stability for duplicate scores.
Concepts Involved:
● Merge Sort
● Merging sorted sublists
● Large datasets with stable sorting
 */
public class EduResults {

	public static List<Student> merge(List<Student> list1, List<Student> list2) {

		int i = 0, j = 0;

		List<Student> unionList = new ArrayList<>();

		while (i < list1.size() && j < list2.size()) {
			if (list1.get(i).score <= list2.get(j).score) {
				unionList.add(list1.get(i));
				i++;
			} else {
				unionList.add(list2.get(j));
				j++;
			}
		}

		while (i < list1.size()) {
			unionList.add(list1.get(i));
			i++;
		}

		while (j < list2.size()) {
			unionList.add(list2.get(j));
			j++;
		}

		return unionList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of district: ");
		int n = sc.nextInt();
		sc.nextLine();
		List<Student> ul = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the total number of students in distrct number "+ (i+1));
			int stunum = sc.nextInt();
			sc.nextLine();
			
			List<Student> stulist = new ArrayList<>();
			for (int j = 0; j < stunum; j++) {
				System.out.println("Enter the name of student number "+(j+1));
				String name = sc.nextLine();
				System.out.println("Enter the score of the students number "+(j+1));
				int score = sc.nextInt();
				sc.nextLine();		
				
				Student stu = new Student(name,score);
				stulist.add(stu);		
			}
			System.out.println("List of student's on district number " + (i + 1)+ ": "+ stulist);
			if (i == 0) {
				ul = stulist; // first district
			} else {
				ul = merge(ul, stulist); // merge next districts
			}
		}
		System.out.println("final state-wise rank list "+ ul);
	}

}
