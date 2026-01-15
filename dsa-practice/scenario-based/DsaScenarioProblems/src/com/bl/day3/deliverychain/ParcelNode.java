package com.bl.day3.deliverychain;

public class ParcelNode {
    String stage;
    ParcelNode next;

    public ParcelNode(String stage) {
        this.stage = stage;
        this.next = null;
    }
}
