package com.bl.conversions.otherconversions;
import java.util.*;
import java.util.stream.*;

public class StreamToMap {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "API");

        Map<String, Integer> map =
                stream.collect(Collectors.toMap(s -> s, String::length));

        System.out.println(map);
    }
}
