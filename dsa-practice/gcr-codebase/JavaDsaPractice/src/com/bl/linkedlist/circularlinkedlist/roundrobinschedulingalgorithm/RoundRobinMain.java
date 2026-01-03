package com.bl.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinMain {
	public static void main(String[] args) {
        RoundRobinScheduling rr = new RoundRobinScheduling(4);

        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 5, 2);
        rr.addProcess(3, 8, 1);

        rr.schedule();
    }
}
