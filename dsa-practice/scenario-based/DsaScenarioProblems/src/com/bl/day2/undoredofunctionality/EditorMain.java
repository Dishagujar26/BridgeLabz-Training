package com.bl.day2.undoredofunctionality;

import java.util.Scanner;

public class EditorMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TextEditor editor = new TextEditor();
		System.out.println("Welcome to Disha's Text Editor");
		while (true) {
			System.out.println("What Operations do you want to perform?\n1." + " Insert Text\n2. Delete Text\n3. "
					+ "Undo Previous Operation\n4. " + "Redo Previous Operation\n5. See Text\n6. Exit");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println("Enter the text you want to insert: ");
				String text = sc.nextLine();
				System.out.println("Enter the position you want to insert in: ");
				int pos = sc.nextInt();

				System.out.println("Text before insertion :" + editor.content);
				editor.insert(text, pos);
				System.out.println("Text after insertion :" + editor.content);
			} else if (choice == 2) {
				System.out.println("Enter the positiono of the text you want to delete: ");
				int pos = sc.nextInt();
				System.out.println("Enter the length of the text to be elete:");
				int length = sc.nextInt();

				System.out.println("Text before deletion :" + editor.content);
				editor.delete(pos, length);
				System.out.println("Text after deletion :" + editor.content);

			} else if (choice == 3) {
				System.out.println("Text before undo operation :" + editor.content);
				editor.undo();
				System.out.println("Text after undo operation :" + editor.content);

			} else if (choice == 4) {
				System.out.println("Text before redo operation :" + editor.content);
				editor.undo();
				System.out.println("Text after redo operation :" + editor.content);
			} else if (choice == 5) {
				System.out.println("The Text: " + editor.content);
			} else if (choice == 6) {
				System.out.println("Thank you for using!!");
				break;
			} else {
				System.out.println("Invalid Choice!!");
				break;
			}
		}
		sc.close();
	}

}
