package com.bl.practiceproblems.threadstatemonitoring;

public class ThreadStateDemo {
	public static void main(String[] args) {
		TaskRunner t1 = new TaskRunner();
		TaskRunner t2 = new TaskRunner();

		t1.setName("Task-1");
		t2.setName("Task-2");

		StateMonitor monitor = new StateMonitor(new Thread[] { t1, t2 });

		monitor.start();
		t1.start();
		t2.start();
	}
}