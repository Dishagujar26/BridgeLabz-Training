package com.bl.linkedlist.singlelinkedlist.studentmanagementsystem;

public class StudentMain {

	public static void main(String[] args) {
		StudentLinkedList list = new StudentLinkedList();

		list.addAtBeginning(1, "Amit", 20, 'A');
		list.addAtEnd(2, "Neha", 21, 'B');
		list.addAtPosition(2, 3, "Rahul", 19, 'A');

		list.display();

		list.search(2);
		list.updateGrade(2, 'A');
		list.deleteByRollNo(1);

		System.out.println("After updates:");
		list.display();
	}

}
