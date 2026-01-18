package com.bl.day6.sortartistsbyregistrationtime;
/*
 9. ArtExpo – Sort Artists by Registration Time (Insertion Sort)
Story: At an art exhibition, artists register throughout the day. The system continuously adds
each entry and maintains a sorted list by registration time for booth assignment. Insertion Sort
fits well due to the incremental nature.
Key Concepts:
● Real-time insertion
● Nearly sorted data
● Time-based ordering
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArtExpo {

	public static void insertionSort(List<Artist> artists) {
		for (int i = 1; i < artists.size(); i++) {
			Artist key = artists.get(i);
			int j = i - 1;

			while (j >= 0 && artists.get(j).getRegistrationTime() > key.getRegistrationTime()) {
				artists.set(j + 1, artists.get(j));
				j--;
			}
			artists.set(j + 1, key);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Artist> artists = new ArrayList<>();

		System.out.print("Enter number of artists: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter artist name: ");
			String name = sc.nextLine();
			System.out.print("Enter registration time: ");
			int time = sc.nextInt();
			sc.nextLine();
			artists.add(new Artist(name, time));
		}

		insertionSort(artists);

		System.out.println("\nSorted Artists by Registration Time:");
		for (Artist a : artists) {
			System.out.println(a);
		}
	}
}
