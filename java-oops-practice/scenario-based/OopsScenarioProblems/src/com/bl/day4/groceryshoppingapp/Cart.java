package com.bl.day4.groceryshoppingapp;

import java.util.ArrayList;
import java.util.List;

public class Cart implements ICheckout{
	private List<Product> products;
    private double totalPrice;

    // Constructor without items
    public Cart() {
        products = new ArrayList<>();
    }

    // Constructor with pre-selected items
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product p) {
        products.add(p);
        calculateTotal();
    }

    // Only Cart updates price
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice() * p.getQuantity(); // operator use
        }
    }

    @Override
    public double applyDiscount(double total) {
        double discount = 0;
        for (Product p : products) {
            discount += p.getDiscount(total);
        }
        return total - discount; // operator use
    }

    @Override
    public void generateBill() {
        System.out.println("----- SwiftCart Bill -----");
        for (Product p : products) {
            System.out.println(p.getName() + " x " + p.getQuantity());
        }
        System.out.println("Total: " + totalPrice);
        System.out.println("Final Amount: " + applyDiscount(totalPrice));
    }

}
