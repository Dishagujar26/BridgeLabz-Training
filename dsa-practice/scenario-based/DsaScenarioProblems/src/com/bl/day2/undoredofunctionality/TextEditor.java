package com.bl.day2.undoredofunctionality;

import java.util.Stack;

public class TextEditor {

	protected StringBuilder content = new StringBuilder("TECHNOCRATS INSTITUTE OF TECHNOLOGY"); // content to be modified 
	private Stack<Action> undoStack = new Stack<>();
	private Stack<Action> redoStack = new Stack<>();

	// Insert operation
	public void insert(String text, int position) {
		content.insert(position, text); // offset, string
		undoStack.push(new Action("INSERT", text, position)); //store the action performed 
		redoStack.clear(); // new action clears re-do history (stack)
	}

	// Delete operation
	public void delete(int position, int length) {
		String removed = content.substring(position, position + length);
		content.delete(position, position + length);
		undoStack.push(new Action("DELETE", removed, position)); // store the action performed 
		redoStack.clear();
	}

	// Undo operation
	public void undo() {
		if (undoStack.isEmpty()) {
			System.out.println("Nothing to undo");
			return;
		}

		Action a = undoStack.pop();

		if (a.type.equals("INSERT")) { // if the action performed was insert then we undo it by deleting 
			content.delete(a.position, a.position + a.text.length());
		} else {  // if the action performed was delete then we undo it by inserting  
			content.insert(a.position, a.text);
		}

		redoStack.push(a); // we will push the undo operation in we re-do it 
	}

	// Re-do operation
	public void redo() {
		if (redoStack.isEmpty()) {
			System.out.println("Nothing to redo");
			return;
		}

		Action a = redoStack.pop();

		if (a.type.equals("INSERT")) {
			content.insert(a.position, a.text);
		} else {
			content.delete(a.position, a.position + a.text.length());
		}

		undoStack.push(a);
	}

}
