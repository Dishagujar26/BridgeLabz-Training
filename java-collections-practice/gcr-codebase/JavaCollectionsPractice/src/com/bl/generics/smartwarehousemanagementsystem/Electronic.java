package com.bl.generics.smartwarehousemanagementsystem;

public class Electronic extends WarehouseItem {
	public Electronic(int quantity, String itemId) {
		super(quantity, itemId);
	}

	@Override
	public String getItemType() {
		return "Electronics";
	}
}
