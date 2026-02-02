package com.bl.conversions.otherconversions;
import java.util.*;
import java.util.stream.*;

public class StreamToSet {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "B", "A");

        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set);
    }
}
