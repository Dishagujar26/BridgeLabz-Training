package com.bl.collections.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ElementFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fruits name enter null to exit");
		List<String> al = new ArrayList<>();

		String var;
		while (true) {
			var = sc.next();
			if (var.equalsIgnoreCase("null")) {
			    break;
			}
			al.add(var);

		}
		System.out.println(al);
		HashMap<String, Integer> map = new HashMap<>();
		// crating a frequency array
		for (int i = 0; i < al.size(); i++) {
           map.put(al.get(i), map.getOrDefault(al.get(i), 0)+1);
		}
		
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue());
		}
	}

}
