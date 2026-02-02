package com.bl.streamslogical1;
import java.util.*;
import java.util.stream.*;

public class CharCountExceptSpace {
    public static void main(String[] args) {
        String s = "java stream";

        Map<Character, Long> map =
                s.chars()
                 .filter(c -> c != ' ')
                 .mapToObj(c -> (char) c)
                 .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(map);
    }
}
