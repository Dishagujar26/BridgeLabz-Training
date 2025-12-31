package com.bl.objectmodeling.selfproblems.problem4;

import java.util.ArrayList;

public class Order {
	int orderId;
    ArrayList<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.show();
        }
    }

}
