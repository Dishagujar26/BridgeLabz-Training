package com.bl.day2.smarthospitalinventorytracker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Item<T> {
    private String itemID;
    private String itemName;
    private int quantity;
    private LocalDate expiryDate;
    private T type; // e.g., Medicine, SurgicalTool, etc.

    public Item(String itemID, String itemName, int quantity, String expiryDateStr, T type) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.type = type;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.expiryDate = LocalDate.parse(expiryDateStr, formatter);
    }

    public String getItemID() { return itemID; }
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public T getType() { return type; }

    @Override
    public String toString() {
        return itemName + " (" + itemID + ") | Qty: " + quantity + " | Exp: " + expiryDate + " | Type: " + type;
    }

    // For Set uniqueness based on itemID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item<?> item = (Item<?>) o;
        return Objects.equals(itemID, item.itemID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemID);
    }
}
