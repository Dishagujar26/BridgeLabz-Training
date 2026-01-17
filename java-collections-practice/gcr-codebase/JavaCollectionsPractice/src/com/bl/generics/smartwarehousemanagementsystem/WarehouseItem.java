package com.bl.generics.smartwarehousemanagementsystem;

public abstract class WarehouseItem {
	protected int quantity;
	protected String itemId;

	public WarehouseItem(int quantity, String itemId) {
		this.quantity = quantity;
		this.itemId = itemId;
	}

	public abstract String getItemType();

}
