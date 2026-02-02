package com.bl.conversions.listtomap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomKeyMap {
    public static void main(String[] args) {
        List<Product> list = List.of(
                new Product("P101", 100),
                new Product("P102", 200)
        );

        Map<String, Product> map =
                list.stream()
                    .collect(Collectors.toMap(p -> p.code, p -> p));

        System.out.println(map);
    }
}