package com.bl.optionalclass.scenario4;

import java.util.Optional;

class Product {
    String name;
    Double discount;
    String coupon;
    String description;
    String seller;
    String deliveryPartner;

    Product(String name, Double discount, String coupon, String description, String seller, String deliveryPartner) {
        this.name = name;
        this.discount = discount;
        this.coupon = coupon;
        this.description = description;
        this.seller = seller;
        this.deliveryPartner = deliveryPartner;
    }

    Optional<Double> getDiscount() { return Optional.ofNullable(discount); }
    Optional<String> getCoupon() { return Optional.ofNullable(coupon); }
    Optional<String> getDescription() { return Optional.ofNullable(description); }
    Optional<String> getSeller() { return Optional.ofNullable(seller); }
    Optional<String> getDeliveryPartner() { return Optional.ofNullable(deliveryPartner); }
}