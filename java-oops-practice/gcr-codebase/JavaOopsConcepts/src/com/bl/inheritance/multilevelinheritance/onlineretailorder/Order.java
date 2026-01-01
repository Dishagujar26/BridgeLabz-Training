package com.bl.inheritance.multilevelinheritance.onlineretailorder;

public class Order {
	int orderId;
	String orderDate;

	public Order(int orderId, String orderDate) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	void getOrderStatus() {
		System.out.println("Order ID: "+ orderId);
		System.out.println("Order Date: "+orderDate);
	}

}
