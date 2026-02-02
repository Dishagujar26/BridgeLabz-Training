package com.bl.conversions.listtomap;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.atomic.AtomicInteger;

public class IndexElementMap {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        AtomicInteger index = new AtomicInteger(0);

        Map<Integer, String> map =
                list.stream()
                    .collect(Collectors.toMap(
                            i -> index.getAndIncrement(),
                            i -> i));

        System.out.println(map);
    }
}
