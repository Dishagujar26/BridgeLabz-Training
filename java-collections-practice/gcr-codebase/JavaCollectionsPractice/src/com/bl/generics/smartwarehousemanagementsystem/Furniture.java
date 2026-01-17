package com.bl.generics.smartwarehousemanagementsystem;

public class Furniture extends WarehouseItem {
    public Furniture(int quantity, String itemId) {
        super(quantity, itemId);
    }

    @Override
    public String getItemType() {
        return "Furniture";
    }
}
