package com.bl.streamslogical2;
import java.util.*;
public class SumNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
