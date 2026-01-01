package com.bl.inheritance.multilevelinheritance.onlineretailorder;

public class OrderMain {
   public static void maoin(String []args) {
	   Order order = new DeliveredOrder(01,"12-Dec-2025",67895,"16-Dec-2025");
	   order.getOrderStatus();
   }
}
