package com.bl.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class ProcessNode {
	int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnAroundTime;
    ProcessNode next;

    ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}
