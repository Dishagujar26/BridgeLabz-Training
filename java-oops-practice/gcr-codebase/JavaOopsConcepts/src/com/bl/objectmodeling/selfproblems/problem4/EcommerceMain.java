package com.bl.objectmodeling.selfproblems.problem4;

public class EcommerceMain {

	public static void main(String[] args) {

		// association + communication -> customer <--> order
		// aggregation --> Order HAS Products
		
		Product p1 = new Product("Laptop", 70000);
		Product p2 = new Product("Mouse", 500);

		Order order = new Order(101);
		order.addProduct(p1);
		order.addProduct(p2);

		Customer customer = new Customer("Disha");
		customer.placeOrder(order);
		customer.viewOrders();
	}

}
