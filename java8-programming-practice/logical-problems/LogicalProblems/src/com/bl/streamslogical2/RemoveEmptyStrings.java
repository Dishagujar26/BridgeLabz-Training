package com.bl.streamslogical2;
import java.util.*;
public class RemoveEmptyStrings {
    public static void main(String[] args) {
        List<String> list = List.of("java","","spring","","boot");
        List<String> result = list.stream()
                                  .filter(s -> !s.isEmpty())
                                  .toList();
        System.out.println(result);
    }
}
