package com.bl.linkedlist.singlelinkedlist.inventorymanagementsystem;

public class InventoryLinkedList {
	private InventoryNode head;

    // Add at beginning
    public void addAtBeginning(int id, String name, int qty, double price) {
        InventoryNode node = new InventoryNode(id, name, qty, price);
        node.next = head;
        head = node;
    }

    // Add at end
    public void addAtEnd(int id, String name, int qty, double price) {
        InventoryNode node = new InventoryNode(id, name, qty, price);
        if (head == null) {
            head = node;
            return;
        }
        InventoryNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }

    // Add at specific position (1-based)
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }
        InventoryNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        InventoryNode node = new InventoryNode(id, name, qty, price);
        node.next = temp.next;
        temp.next = node;
    }

    // Remove item by Item ID
    public void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }
        InventoryNode temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
        else
            System.out.println("Item not found");
    }

    // Update quantity by Item ID
    public void updateQuantity(int id, int newQty) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Item ID
    public void searchById(int id) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Item Name
    public void searchByName(String name) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Total inventory value
    public void totalInventoryValue() {
        double total = 0;
        InventoryNode temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    // Sort by Name or Price (Bubble Sort on Linked List)
    public void sort(boolean byName, boolean ascending) {
        if (head == null) return;

        for (InventoryNode i = head; i.next != null; i = i.next) {
            for (InventoryNode j = head; j.next != null; j = j.next) {

                boolean condition;
                if (byName) {
                    condition = ascending
                            ? j.itemName.compareToIgnoreCase(j.next.itemName) > 0
                            : j.itemName.compareToIgnoreCase(j.next.itemName) < 0;
                } else {
                    condition = ascending
                            ? j.price > j.next.price
                            : j.price < j.next.price;
                }

                if (condition) {
                    swapData(j, j.next);
                }
            }
        }
    }

    private void swapData(InventoryNode a, InventoryNode b) {
        int id = a.itemId; a.itemId = b.itemId; b.itemId = id;
        String name = a.itemName; a.itemName = b.itemName; b.itemName = name;
        int qty = a.quantity; a.quantity = b.quantity; b.quantity = qty;
        double price = a.price; a.price = b.price; b.price = price;
    }

    // Display all items
    public void display() {
        InventoryNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(InventoryNode item) {
        System.out.println(item.itemId + " | " + item.itemName +
                " | Qty: " + item.quantity + " | Price: " + item.price);
    }

}
