package com.bl.conversions.listtomap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HandleDuplicateKeys {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "A");

        Map<String, String> map =
                list.stream()
                    .collect(Collectors.toMap(
                            s -> s,
                            s -> s,
                            (oldVal, newVal) -> oldVal));

        System.out.println(map);
    }
}