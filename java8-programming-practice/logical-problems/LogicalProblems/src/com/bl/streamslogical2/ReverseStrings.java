package com.bl.streamslogical2;
import java.util.*;
public class ReverseStrings {
    public static void main(String[] args) {
        List<String> list = List.of("java","api");
        List<String> reversed = list.stream()
                                    .map(s -> new StringBuilder(s).reverse().toString())
                                    .toList();
        System.out.println(reversed);
    }
}
