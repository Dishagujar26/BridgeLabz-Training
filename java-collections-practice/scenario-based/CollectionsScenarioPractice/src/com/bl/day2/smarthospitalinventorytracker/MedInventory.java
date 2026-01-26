package com.bl.day2.smarthospitalinventorytracker;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.*;

/*
 6. MedInventory – Smart Hospital Inventory Tracker
Story: At Apollo International Hospital, a new system called MedInventory is being built to track
medical supplies such as gloves, syringes, and oxygen cylinders.
Every morning, the inventory data is dumped as a .csv file containing:
ItemID,ItemName,Quantity,ExpiryDate
The Java system must:
● Read inventory files using BufferedReader (I/O Streams)
● Detect expired items using Regex on the ExpiryDate field (dd-MM-yyyy)
● Categorize items by type using Map<String, List<Item>>
● Remove duplicates using Set<Item> based on item ID
● Use Generics to allow extension to surgical tools, medicines, etc.
● Raise custom exceptions for critically low supplies
*/
public class MedInventory {

	private static final Pattern DATE_PATTERN = Pattern.compile("\\d{2}-\\d{2}-\\d{4}"); // dd-MM-yyyy

	public static void main(String[] args) throws IOException {

		File folder = new File("D:\\scenariospecifidir\\inventory"); // folder with .csv files
		Map<String, List<Item<String>>> categoryMap = new HashMap<>();
		Set<Item<String>> uniqueItems = new HashSet<>();

		if (folder.listFiles() == null) {
			System.out.println("No inventory files found.");
			return;
		}

		for (File file : folder.listFiles()) {
			if (!file.getName().endsWith(".csv"))
				continue;

			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				String line;
				br.readLine(); // skip header

				while ((line = br.readLine()) != null) {
					try {
						String[] parts = line.split(",");
						if (parts.length != 4 || !DATE_PATTERN.matcher(parts[3]).matches()) {
							throw new Exception("Invalid line format: " + line);
						}

						String id = parts[0];
						String name = parts[1];
						int qty = Integer.parseInt(parts[2]);
						String expiry = parts[3];
						String type = "Medicine"; // example; can extend to SurgicalTool etc.

						Item<String> item = new Item<>(id, name, qty, expiry, type);
						uniqueItems.add(item);

						// Categorize by type
						categoryMap.computeIfAbsent(type, k -> new ArrayList<>()).add(item);

						// Raise exception for critically low supply
						if (qty < 5) {
							throw new LowSupplyException("Critically low supply: " + name + " (Qty: " + qty + ")");
						}

						// Detect expired items
						if (item.getExpiryDate().isBefore(LocalDate.now())) {
							System.out.println("Expired: " + item);
						}

					} catch (LowSupplyException e) {
						System.out.println(e.getMessage());
					} catch (Exception e) {
						System.out.println("Skipping invalid line: " + line);
					}
				}

			} catch (IOException e) {
				System.out.println("Error reading file: " + file.getName());
			}
		}

		System.out.println("\nInventory Categorized by Type:");
		categoryMap.forEach((type, list) -> {
			System.out.println("\nType: " + type);
			list.forEach(System.out::println);
		});

		System.out.println("\nUnique Items:");
		uniqueItems.forEach(System.out::println);
	}
}
