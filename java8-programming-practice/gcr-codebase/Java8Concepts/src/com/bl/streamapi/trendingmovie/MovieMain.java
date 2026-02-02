package com.bl.streamapi.trendingmovie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovieMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Movie> list = new ArrayList<>();
		while (true) {
			System.out.println("1. Add Movie\n2. Show Trending Movies\n3. Exit");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println("Movie Name:");
				String name = sc.nextLine();
				System.out.println("Movie Rating:");
				int rate = sc.nextInt();
				sc.nextLine();
				System.out.println("Movie Year:");
				int year = sc.nextInt();
				sc.nextLine();

				Movie m = new Movie(name, rate, year);
				list.add(m);
				System.out.println("Movie added succesfully!");

			} else if (choice == 2) {
				List<Movie> mlist = list.stream().filter(m -> m.getRating() >= 8)
						.sorted(Comparator.comparing(Movie::getRating).reversed().thenComparing(Movie::getYear))
						.limit(1).collect(Collectors.toList());
				for (Movie m : mlist) {
					System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
				}

			} else if (choice == 3) {
				System.out.println("Thank you...");
				break;

			} else {
				System.out.println("Invalid Choice...");
				break;
			}

		}

	}
}
