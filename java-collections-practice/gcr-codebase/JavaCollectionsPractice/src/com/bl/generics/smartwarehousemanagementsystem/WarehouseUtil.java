package com.bl.generics.smartwarehousemanagementsystem;

import java.util.List;

public class WarehouseUtil {

	public static void displayItems(List<? extends WarehouseItem> items) {
		for (WarehouseItem item : items) {
			System.out.println(item.getItemType() + " | ID: " + item.itemId + " | Qty: " + item.quantity);
		}
	}
}
