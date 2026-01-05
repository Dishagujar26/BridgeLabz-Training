package com.bl.hashmapsandfunctions.customhashmap;

import java.util.Scanner;

public class MyHashMapMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyHashMap<Integer, String> map = new MyHashMap<>();

		while (true) {
			System.out.println("\n1. Put\n2. Get\n3. Remove\n4. Display\n5. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter key (Integer): ");
				int key = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter value (String): ");
				String value = sc.nextLine();
				map.put(key, value);
				break;
			case 2:
				System.out.print("Enter key to get: ");
				key = sc.nextInt();
				String result = map.get(key);
				System.out.println(result != null ? "Value: " + result : "Key not found");
				break;
			case 3:
				System.out.print("Enter key to remove: ");
				key = sc.nextInt();
				map.remove(key);
				System.out.println("Removed if existed.");
				break;
			case 4:
				map.display();
				break;
			case 5:
				System.out.println("Exiting...");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice");
			}
		}
	}

}
