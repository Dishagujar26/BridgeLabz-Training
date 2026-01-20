package com.bl.day8.theatershowlistings;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
/*
 6. MovieTime – Theater Show Listings (Insertion Sort)
Story: A movie theater allows users to sort upcoming show-times. Since shows are added
throughout the day and the existing list is almost sorted, the app uses Insertion Sort to insert
each new show in the correct time slot.
Concepts Involved:
● Insertion Sort
● Real-time insertion
● Time-based ordering
 */
import java.util.Scanner;

public class MovieTime {
	
	public static void insertionsort(List<Movie> mlist) {
		for(int i=1;i<mlist.size();i++) {
			Movie key = mlist.get(i);
			LocalTime currentTime = key.time;
			int prev = i-1;
			
			while(prev >= 0 && mlist.get(prev).time.compareTo(currentTime) > 0) {
				mlist.set(prev + 1, mlist.get(prev)); // shift
	            prev--;
			}
			mlist.set(prev + 1, key); 
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Movie> mlist = new ArrayList<>();
		System.out.println("Enter the number movie you want to add: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
           System.out.println("Enter the name of movie number "+(i+1));
           String name = sc.nextLine();
           System.out.println("Enter the time (HH:mm) of movie number "+ name);
           String time = sc.nextLine();
           LocalTime showTime = LocalTime.parse(time);

           Movie m = new Movie(name,showTime);
           mlist.add(m);    
		}
		System.out.println("Movie list before: "+ mlist);
		insertionsort(mlist);
		System.out.println("Movie list after: "+ mlist);

		
	}

}
