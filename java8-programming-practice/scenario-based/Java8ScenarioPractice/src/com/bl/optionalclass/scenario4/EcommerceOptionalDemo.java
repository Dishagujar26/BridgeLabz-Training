package com.bl.optionalclass.scenario4;

public class EcommerceOptionalDemo {
    public static void main(String[] args) {
        Product p = new Product("Laptop", null, null, null, "BestSeller", null);

        System.out.println("Discount: " + p.getDiscount().orElse(5.0));
        p.getCoupon().ifPresent(c -> System.out.println("Coupon: " + c));
        System.out.println("Seller: " + p.getSeller().orElse("Unknown"));
        System.out.println("Description: " + p.getDescription().orElse("No description available"));
        System.out.println("Delivery Partner: " + p.getDeliveryPartner().orElse("No delivery partner"));
    }
}
