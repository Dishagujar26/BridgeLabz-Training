package com.bl.generics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;
// class level generic
public class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    // method-level generic NOT needed here
    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }
}
