package com.bl.conversions.otherconversions;
import java.util.*;
import java.util.stream.*;

public class StreamToList {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);

        List<Integer> list = stream.toList();
        System.out.println(list);
    }
}
