package com.bl.streamslogical1;
import java.util.*;
import java.util.stream.*;

public class KeepOnlyAlphabets {
    public static void main(String[] args) {
        String s = "java8stream2025";

        String result =
                s.chars()
                 .filter(Character::isLetter)
                 .mapToObj(c -> String.valueOf((char) c))
                 .collect(Collectors.joining());

        System.out.println(result);
    }
}
