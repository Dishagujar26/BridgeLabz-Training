package com.bl.linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerMain {
	public static void main(String[] args) {
		TaskScheduler ts = new TaskScheduler();

		ts.addAtEnd(1, "Design UI", 1, "2026-01-10");
		ts.addAtEnd(2, "Write Code", 2, "2026-01-12");
		ts.addAtBeginning(3, "Requirement Analysis", 1, "2026-01-08");

		ts.displayTasks();

		ts.nextTask();
		ts.nextTask();

		ts.searchByPriority(1);

		ts.removeTask(2);
		ts.displayTasks();
	}
}
