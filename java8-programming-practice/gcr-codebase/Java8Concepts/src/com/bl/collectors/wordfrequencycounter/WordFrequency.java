package com.bl.collectors.wordfrequencycounter;

import java.util.*;
import java.util.stream.*;

public class WordFrequency {
	public static void main(String[] args) {

		String text = "java streams java collectors";
// toMap(keyMapper, valueMapper, mergeFunction)

		Map<String, Integer> freq = Arrays.stream(text.split(" "))
				.collect(Collectors.toMap(w -> w, w -> 1, Integer::sum));

		System.out.println(freq);
	}
}
