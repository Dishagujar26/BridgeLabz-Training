package com.bl.streamslogical2;
import java.util.*;
import java.util.stream.*;
public class StringLengths {
    public static void main(String[] args) {
        List<String> list = List.of("cat","elephant","dog");
        List<Integer> lengths = list.stream()
                                    .map(String::length)
                                    .toList();
        System.out.println(lengths);
    }
}
