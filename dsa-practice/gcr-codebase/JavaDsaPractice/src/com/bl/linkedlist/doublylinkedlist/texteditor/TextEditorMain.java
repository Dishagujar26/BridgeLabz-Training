package com.bl.linkedlist.doublylinkedlist.texteditor;

public class TextEditorMain {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();

		editor.addState("Hello");
		editor.addState("Hello World");
		editor.addState("Hello World!");
		editor.display();

		editor.undo();
		editor.display();

		editor.undo();
		editor.display();

		editor.redo();
		editor.display();

		editor.addState("Hello Java");
		editor.display();
	}
}
