package com.bl.linkedlist.doublylinkedlist.texteditor;

public class TextEditor {
	private TextNode head;
	private TextNode tail;
	private TextNode current;
	private int size;
	private final int MAX_SIZE = 10;

	// Add new text state
	public void addState(String text) {
		TextNode node = new TextNode(text);

		// Remove redo history
		if (current != null && current.next != null) {
			current.next.prev = null;
			current.next = null;
			tail = current;
			size = countNodes();
		}

		if (head == null) {
			head = tail = current = node;
			size = 1;
			return;
		}

		tail.next = node;
		node.prev = tail;
		tail = node;
		current = node;
		size++;

		// Limit history size
		if (size > MAX_SIZE) {
			head = head.next;
			head.prev = null;
			size--;
		}
	}

	// Undo
	public void undo() {
		if (current != null && current.prev != null)
			current = current.prev;
		else
			System.out.println("No more undo available");
	}

	// Redo
	public void redo() {
		if (current != null && current.next != null)
			current = current.next;
		else
			System.out.println("No more redo available");
	}

	// Display current text
	public void display() {
		if (current != null)
			System.out.println("Current Text: " + current.content);
		else
			System.out.println("Editor is empty");
	}

	// Helper method
	private int countNodes() {
		int count = 0;
		TextNode temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

}
