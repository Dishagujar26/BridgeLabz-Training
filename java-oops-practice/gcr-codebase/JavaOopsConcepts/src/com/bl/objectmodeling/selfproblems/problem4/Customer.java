package com.bl.objectmodeling.selfproblems.problem4;

import java.util.ArrayList;

public class Customer {
	 String name;
	    ArrayList<Order> orders = new ArrayList<>();

	    Customer(String name) {
	        this.name = name;
	    }

	    void placeOrder(Order order) {
	        orders.add(order); // communication
	        System.out.println(name + " placed Order " + order.orderId);
	    }

	    void viewOrders() {
	        System.out.println("Orders of " + name + ":");
	        for (Order o : orders) {
	            o.showOrder();
	        }
	    }

}
