package com.bl.streamslogical2;
import java.util.*;
import java.util.stream.*;
public class UppercaseStrings {
    public static void main(String[] args) {
        List<String> list = List.of("java","spring","boot");
        List<String> upper = list.stream()
                                 .map(String::toUpperCase)
                                 .toList();
        System.out.println(upper);
    }
}
