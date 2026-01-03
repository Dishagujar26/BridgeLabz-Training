package com.bl.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinScheduling {
	private ProcessNode head;
	private ProcessNode tail;
	private int timeQuantum;

	RoundRobinScheduling(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

	// Add process at end
	public void addProcess(int pid, int burst, int priority) {
		ProcessNode node = new ProcessNode(pid, burst, priority);

		if (head == null) {
			head = tail = node;
			node.next = head;
			return;
		}

		tail.next = node;
		node.next = head;
		tail = node;
	}

	// Simulate Round Robin Scheduling
	public void schedule() {
		if (head == null)
			return;

		int currentTime = 0;
		int completed = 0;
		int totalProcesses = countProcesses();

		ProcessNode curr = head;
		ProcessNode prev = tail;

		while (completed < totalProcesses) {

			if (curr.remainingTime > 0) {
				int execTime = Math.min(timeQuantum, curr.remainingTime);
				curr.remainingTime -= execTime;
				currentTime += execTime;

				// Update waiting time for other processes
				ProcessNode temp = head;
				do {
					if (temp != curr && temp.remainingTime > 0)
						temp.waitingTime += execTime;
					temp = temp.next;
				} while (temp != head);

				// Process completed
				if (curr.remainingTime == 0) {
					curr.turnAroundTime = currentTime;
					completed++;

					// Remove from circular list
					if (curr == head && curr == tail) {
						head = tail = null;
						break;
					} else if (curr == head) {
						head = head.next;
						tail.next = head;
						curr = head;
					} else if (curr == tail) {
						tail = prev;
						tail.next = head;
						curr = tail.next;
					} else {
						prev.next = curr.next;
						curr = prev.next;
					}
					displayQueue();
					continue;
				}
			}

			prev = curr;
			curr = curr.next;
			displayQueue();
		}

		displayAverages(totalProcesses);
	}

	// Display circular queue
	public void displayQueue() {
		if (head == null)
			return;

		ProcessNode temp = head;
		System.out.print("Queue: ");
		do {
			System.out.print("P" + temp.pid + "(" + temp.remainingTime + ") ");
			temp = temp.next;
		} while (temp != head);
		System.out.println();
	}

	private int countProcesses() {
		if (head == null)
			return 0;
		int count = 0;
		ProcessNode temp = head;
		do {
			count++;
			temp = temp.next;
		} while (temp != head);
		return count;
	}

	// Average waiting & turnaround time
	private void displayAverages(int n) {
		int totalWT = 0, totalTAT = 0;
		ProcessNode temp = head;

		if (temp != null) {
			do {
				totalWT += temp.waitingTime;
				totalTAT += temp.turnAroundTime;
				temp = temp.next;
			} while (temp != head);
		}

		System.out.println("Average Waiting Time: " + (double) totalWT / n);
		System.out.println("Average Turnaround Time: " + (double) totalTAT / n);
	}
}
