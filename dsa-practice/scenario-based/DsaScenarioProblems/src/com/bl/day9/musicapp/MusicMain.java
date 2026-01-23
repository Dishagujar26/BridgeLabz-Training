package com.bl.day9.musicapp;

/*
 Story: Music App - Organize Songs by Track ID
A music streaming app organizes tracks in a library using track IDs.
Scenarios:
● 🔹 Scenario 1: Search Track — Users want to search a song using track ID.
● 🔹 Scenario 2: Insert New Track — Add new releases to the library.
● 🔹 Scenario 3: Show Playlist Alphabetically — In-order traversal by song title.
*/
import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MusicTree bst = new MusicTree();

		while (true) {
			System.out.println("\n1. Add New Track");
			System.out.println("2. Search Track");
			System.out.println("3. Display All Tracks");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter the Track ID: ");
				int trackId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Track Name: ");
				String name = sc.nextLine();
				bst.root = bst.insert(bst.root, trackId, name);
				break;

			case 2:
				System.out.print("Enter Track ID Number to Search: ");
				trackId = sc.nextInt();
				MusicNode found = bst.search(bst.root, trackId);
				if (found != null)
					System.out.println("Track Record Found: " + found.trackId + " " + found.trackName);
				else
					System.out.println("Track Record not found.");
				break;

			case 3:
				System.out.println("All Tracks (Sorted Alphabetically):");
				bst.inorder(bst.root);
				break;

			case 4:
				System.out.println("Thank You...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice! Try again.");
			}
		}
	}
}
