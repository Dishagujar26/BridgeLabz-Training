package com.bl.streamslogical1;
import java.util.*;
import java.util.stream.*;

public class KeepOnlyUniqueChars {
    public static void main(String[] args) {
        String s = "aabbccdde";

        String result =
                s.chars()
                 .mapToObj(c -> (char) c)
                 .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                 .entrySet().stream()
                 .filter(e -> e.getValue() == 1)
                 .map(e -> String.valueOf(e.getKey()))
                 .collect(Collectors.joining());

        System.out.println(result);
    }
}
