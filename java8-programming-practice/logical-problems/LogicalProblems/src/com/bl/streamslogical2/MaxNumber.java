package com.bl.streamslogical2;
import java.util.*;
public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,25,3,99,45);
        int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(max);
    }
}
