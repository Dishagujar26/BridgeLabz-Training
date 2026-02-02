package com.bl.conversions.otherconversions;
import java.util.*;
import java.util.stream.*;

public class ListToJsonLike {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B");

        String json =
                list.stream()
                    .map(s -> "\"" + s + "\"")
                    .collect(Collectors.joining(",", "[", "]"));

        System.out.println(json);
    }
}
