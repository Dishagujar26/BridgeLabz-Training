package com.bl.conversions.listtomap;
import java.util.*;
import java.util.stream.*;

public class WordFrequencyMap {
    public static void main(String[] args) {
        List<String> words = List.of("java", "spring", "java");

        Map<String, Integer> map =
                words.stream()
                     .collect(Collectors.toMap(
                             w -> w,
                             w -> 1,
                             Integer::sum));

        System.out.println(map);
    }
}
