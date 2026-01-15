package com.bl.day3.deliverychain;

public class ParcelTracker {
    private ParcelNode head;

    public ParcelTracker() {
        head = new ParcelNode("Packed");
        head.next = new ParcelNode("Shipped");
        head.next.next = new ParcelNode("In Transit");
        head.next.next.next = new ParcelNode("Delivered");
    }

    public void display() {
        ParcelNode temp = head;
        while (temp != null) {
            System.out.print(temp.stage + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void addCheckpoint(String after, String newStage) {
        ParcelNode temp = head;
        while (temp != null && !temp.stage.equals(after)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found");
            return;
        }

        ParcelNode node = new ParcelNode(newStage);
        node.next = temp.next;
        temp.next = node;
    }
}
