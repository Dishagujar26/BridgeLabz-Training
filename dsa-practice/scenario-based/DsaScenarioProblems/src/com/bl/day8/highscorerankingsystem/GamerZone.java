package com.bl.day8.highscorerankingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bl.day7.Product;

/*
 8. GamerZone – High Score Ranking System (Quick Sort)
Story: A global multiplayer game needs to rank thousands of players in real-time based on their
scores after every match. The list is dynamic, large, and often unsorted. Quick Sort is used to
reorder players quickly for leaderboards.
Concepts Involved:
● Quick Sort
● Sorting dynamic, large datasets
● Performance-driven solution

 */
public class GamerZone {

	static void quickSort(List<Player> list, int low, int high) {
		if (low < high) {
			int p = partition(list, low, high);
			quickSort(list, low, p - 1);
			quickSort(list, p + 1, high);
		}
	}

	static int partition(List<Player> list, int low, int high) {
		double pivot = list.get(high).playerScore;
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (list.get(j).playerScore < pivot) { 
				i++;
				swap(list, i, j);
			}
		}
		swap(list, i + 1, high);
		return i + 1;
	}

	static void swap(List<Player> list, int i, int j) {
		Player temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players : ");
		int n = sc.nextInt();
		sc.nextLine();
		List<Player> palyers = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name of the player number "+ (i+1));
			String name = sc.nextLine();
			System.out.println("Enter the score on palyer number "+ (i+1));
			int score = sc.nextInt();
			sc.nextLine();
			
			Player p = new Player(name, score);
			palyers.add(p);
		}

		quickSort(palyers, 0, palyers.size() - 1);

		for (Player p : palyers) {
			System.out.println(p.playerName + " - " + p.playerScore);
		}
	}
}
