package com.bl.streamslogical1;
import java.util.*;
import java.util.stream.*;

public class CharFrequencyCount {
    public static void main(String[] args) {
        String s = "banana";

        Map<Character, Long> map =
                s.chars()
                 .mapToObj(c -> (char) c)
                 .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(map);
    }
}
