package com.bl.linkedlist.singlelinkedlist.inventorymanagementsystem;

public class InventoryMain {
	public static void main(String[] args) {
		InventoryLinkedList inv = new InventoryLinkedList();

		inv.addAtEnd(101, "Laptop", 5, 60000);
		inv.addAtBeginning(102, "Mouse", 20, 500);
		inv.addAtPosition(2, 103, "Keyboard", 10, 1500);

		inv.display();

		inv.updateQuantity(101, 7);
		inv.searchByName("Mouse");
		inv.totalInventoryValue();

		inv.sort(true, true); // Sort by Name Ascending
		System.out.println("After Sorting:");
		inv.display();
	}
}
