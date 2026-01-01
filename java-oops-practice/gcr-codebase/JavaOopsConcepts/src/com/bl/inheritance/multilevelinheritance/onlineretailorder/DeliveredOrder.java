package com.bl.inheritance.multilevelinheritance.onlineretailorder;

public class DeliveredOrder extends ShippedOrder  {
	String deliveryDate ;

	public DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}

	@Override
	void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Deivery Date: "+ deliveryDate);
	}

}
