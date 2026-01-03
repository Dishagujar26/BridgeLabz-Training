package com.bl.linkedlist.circularlinkedlist.taskscheduler;

public class TaskScheduler {

	private TaskNode head;
	private TaskNode tail;
	private TaskNode current;

	// Add at beginning
	public void addAtBeginning(int id, String name, int priority, String date) {
		TaskNode node = new TaskNode(id, name, priority, date);

		if (head == null) {
			head = tail = current = node;
			node.next = node;
			return;
		}

		node.next = head;
		head = node;
		tail.next = head;
	}

	// Add at end
	public void addAtEnd(int id, String name, int priority, String date) {
		TaskNode node = new TaskNode(id, name, priority, date);

		if (head == null) {
			head = tail = current = node;
			node.next = node;
			return;
		}

		tail.next = node;
		node.next = head;
		tail = node;
	}

	// Add at specific position (1-based)
	public void addAtPosition(int pos, int id, String name, int priority, String date) {
		if (pos == 1) {
			addAtBeginning(id, name, priority, date);
			return;
		}

		TaskNode temp = head;
		for (int i = 1; i < pos - 1 && temp.next != head; i++)
			temp = temp.next;

		TaskNode node = new TaskNode(id, name, priority, date);
		node.next = temp.next;
		temp.next = node;

		if (temp == tail)
			tail = node;
	}

	// Remove task by ID
	public void removeTask(int id) {
		if (head == null)
			return;

		TaskNode curr = head;
		TaskNode prev = tail;

		do {
			if (curr.taskId == id) {

				// Single task case
				if (curr == head && curr == tail) {
					head = tail = current = null;
					return;
				}

				// Removing head
				if (curr == head) {
					head = head.next;
					tail.next = head;
				}
				// Removing tail
				else if (curr == tail) {
					tail = prev;
					tail.next = head;
				}
				// Middle task
				else {
					prev.next = curr.next;
				}

				if (current == curr)
					current = curr.next;

				return;
			}

			prev = curr;
			curr = curr.next;
		} while (curr != head);

		System.out.println("Task not found");
	}

	// View current task and move to next
	public void nextTask() {
		if (current == null) {
			System.out.println("No tasks available");
			return;
		}

		System.out.println("Current Task:");
		displayTask(current);
		current = current.next;
	}

	// Display all tasks
	public void displayTasks() {
		if (head == null) {
			System.out.println("No tasks scheduled");
			return;
		}

		TaskNode temp = head;
		do {
			displayTask(temp);
			temp = temp.next;
		} while (temp != head);
	}

	// Search by priority
	public void searchByPriority(int priority) {
		if (head == null)
			return;

		TaskNode temp = head;
		boolean found = false;
		do {
			if (temp.priority == priority) {
				displayTask(temp);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (!found)
			System.out.println("No tasks found with priority " + priority);
	}

	private void displayTask(TaskNode t) {
		System.out.println(t.taskId + " | " + t.taskName + " | Priority: " + t.priority + " | Due: " + t.dueDate);
	}

}
