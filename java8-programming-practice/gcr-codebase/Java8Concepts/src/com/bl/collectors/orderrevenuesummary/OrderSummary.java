package com.bl.collectors.orderrevenuesummary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderSummary {
	public static void main(String[] args) {

		List<Order> orders = List.of(new Order("Alice", 500), new Order("Bob", 300), new Order("Alice", 700));

		Map<String, Double> revenue = orders.stream()
				.collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(Order::getAmount)));

		System.out.println(revenue);
	}
}