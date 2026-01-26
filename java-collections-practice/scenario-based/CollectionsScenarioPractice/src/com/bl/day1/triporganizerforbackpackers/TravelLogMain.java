package com.bl.day1.triporganizerforbackpackers;
/*
2. TravelLog – Trip Organizer for Backpackers
Story: Ritika, a travel blogger, maintains a personal app called TravelLog where she stores all
her travel experiences.
Each trip is stored as a serialized object and saved to disk using ObjectOutputStream. She
wants to search all her entries to find:
● All cities she visited using regex over text
● Trip durations more than 5 days
● Unique countries visited (use Set)
● Top 3 cities she visited most often (use Map<City, Integer> and sort)
The system must support both reading/writing trip entries from files and summarizing them using
Java Collections. 
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;

public class TravelLogMain {

	public static void main(String[] args) throws Exception {

		List<Trip> trips = List.of(new Trip("Paris", "France", 7, "Visited Paris and Rome"),
				new Trip("Rome", "Italy", 4, "Rome was amazing"),
				new Trip("Paris", "France", 6, "Paris museums and food"),
				new Trip("Berlin", "Germany", 8, "Berlin history tour"));

		writeTrips(trips);

		List<Trip> loadedTrips = readTrips();

		findCitiesUsingRegex(loadedTrips);
		tripsMoreThanFiveDays(loadedTrips);
		uniqueCountries(loadedTrips);
		topThreeCities(loadedTrips);
	}

	private static void writeTrips(List<Trip> trips) throws IOException {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(TravelLog.FILE_NAME))) {
			oos.writeObject(trips);
		}
	}

	@SuppressWarnings("unchecked")
	private static List<Trip> readTrips() throws IOException, ClassNotFoundException {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(TravelLog.FILE_NAME))) {
			return (List<Trip>) ois.readObject();
		}
	}

	// ● All cities using regex
	private static void findCitiesUsingRegex(List<Trip> trips) {
		System.out.println("\nCities (Regex):");
		for (Trip t : trips) {
			Matcher m = TravelLog.CITY_PATTERN.matcher(t.description);
			while (m.find()) {
				System.out.println(m.group());
			}
		}
	}

	// Trip duration > 5 days
	private static void tripsMoreThanFiveDays(List<Trip> trips) {
		System.out.println("\nTrips > 5 days:");
		trips.stream().filter(t -> t.durationDays > 5).forEach(System.out::println);
	}

	// ● Unique countries
	private static void uniqueCountries(List<Trip> trips) {
		Set<String> countries = new HashSet<>();
		for (Trip t : trips) {
			countries.add(t.country);
		}
		System.out.println("\nUnique Countries: " + countries);
	}

	// Top 3 most visited cities
	private static void topThreeCities(List<Trip> trips) {
		Map<String, Integer> cityCount = new HashMap<>();

		for (Trip t : trips) {
			cityCount.put(t.city, cityCount.getOrDefault(t.city, 0) + 1);
		}

		System.out.println("\nTop 3 Cities:");
		cityCount.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).limit(3)
				.forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
	}

}
