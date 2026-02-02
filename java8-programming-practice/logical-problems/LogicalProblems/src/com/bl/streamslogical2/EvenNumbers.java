package com.bl.streamslogical2;
import java.util.*;
import java.util.stream.*;
public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,5,7,8,10,13);
        List<Integer> evens = list.stream()
                                  .filter(n -> n % 2 == 0)
                                  .toList();
        System.out.println(evens);
    }
}
