package com.bl.day7;

import java.util.Scanner;

/*
5. FitnessTracker – Daily Step Count Ranking (Bubble Sort)
Story: A fitness app tracks steps taken by each user in a small group (less than 20 people). At
the end of the day, it displays rankings. Since the list is small and frequently shuffled due to
last-minute step syncing, a simple Bubble Sort runs quickly to generate the leaderboard.
Concepts Involved:
● Bubble Sort
● Frequent updates
● Real-time re-sorting
*/

public class FitnessTracker {
	
	public static void displayRanking(int []ranking) {
	      for(int i=0;i<ranking.length;i++) {
	    	  System.out.print(ranking[i] +" ");
	      }
	}
	
	public static void sortRanking(int []ranking) {
		boolean isSwapped = false;
		for(int i=0;i<ranking.length-1;i++) {
			for(int j=0;j<ranking.length-i-1;j++) {
				if(ranking[j] > ranking[j+1]) {
					int temp = ranking[j];
					ranking[j] = ranking[j+1];
					ranking[j+1] = temp;
					isSwapped = true;
				}
			}
			if(!isSwapped) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ranking = new int[5];
		for (int i = 0; i < ranking.length; i++) {
			System.out.println("Enter the ranking person number " + (i + 1));
			ranking[i] = sc.nextInt();
		}
		System.out.println("Ranking before: ");
		displayRanking(ranking);
		
		System.out.println();
		sortRanking(ranking);
		
		System.out.println("Ranking after: ");
		displayRanking(ranking);
	}
}
