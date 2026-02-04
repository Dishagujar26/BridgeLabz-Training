package com.bl.practiceproblems.threadstatemonitoring;

public class TaskRunner extends Thread {
	public void run() {
		try {
			Thread.sleep(2000);
			for (int i = 0; i < 1000000; i++) {
			}
		} catch (InterruptedException e) {
		}
	}
}
