package com.bl.conversions.objectcollection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderTotalByCustomer {
    public static void main(String[] args) {
        List<Order> orders = List.of(
            new Order("A",100),
            new Order("A",200),
            new Order("B",150)
        );

        Map<String, Double> map =
                orders.stream()
                      .collect(Collectors.groupingBy(
                          o -> o.customer,
                          Collectors.summingDouble(o -> o.amount)
                      ));

        System.out.println(map);
    }
}