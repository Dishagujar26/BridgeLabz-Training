package com.bl.generics.smartwarehousemanagementsystem;

public class Groceries extends WarehouseItem {
    public Groceries(int quantity, String itemId) {
        super(quantity, itemId);
    }

    @Override
    public String getItemType() {
        return "Groceries";
    }
}
