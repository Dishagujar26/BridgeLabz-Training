package com.bl.day2.ecommercediscountvalidator;

import java.io.File;

/*
  10. DealTracker – E-Commerce Discount Validator
Story: An e-commerce platform is flooded with daily deals, sent in a file like:
DealCode: FLAT50
ValidTill: 15-06-2025
Discount: 50%
MinimumPurchase: 999
The DealTracker tool should:
● Read and parse .txt deal entries using FileInputStream
● Use Regex to extract fields like percentage and date
● Filter expired deals using LocalDate + regex validation
● Store all valid deals in a Map<String, Deal>
● Use a Set to prevent duplicate deal codes
● Allow sorting deals by discount using Comparator
● Use Generics to work with other promotion types: cashback, referral bonus, etc.
 */
public class Main {
	public static void main(String[] args) throws Exception {

		DealTracker<Deal> tracker = new DealTracker<>();

		tracker.readDeal(new File("D:\\scenariospecifidir\\deal1.txt"));
		tracker.readDeal(new File("D:\\scenariospecifidir\\deal2.txt"));

		System.out.println("Valid Deals:");
		tracker.getDeals().values().forEach(System.out::println);

		System.out.println("\nSorted by Discount:");
		tracker.sortByDiscount().forEach(System.out::println);

		// The 50% deal was excluded because its validity date had already passed,
		// and DealTracker filters expired deals using LocalDate before storing them.
	}
}
