package com.bl.streamslogical1;
import java.util.*;
import java.util.stream.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "stress";

        Character ch =
                s.chars()
                 .mapToObj(c -> (char) c)
                 .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                 .entrySet().stream()
                 .filter(e -> e.getValue() == 1)
                 .map(Map.Entry::getKey)
                 .findFirst()
                 .orElse(null);

        System.out.println(ch);
    }
}
