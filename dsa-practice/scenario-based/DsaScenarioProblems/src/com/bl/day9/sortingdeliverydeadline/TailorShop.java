package com.bl.day9.sortingdeliverydeadline;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*9. TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort)
Story: At a tailor’s shop, new clothing orders are received every hour. Each order has a
deadline, and the owner maintains a sorted list of orders by delivery date. Since each new
order is inserted into a nearly sorted list, Insertion Sort is simple and fast.
Concepts Involved:
● Insertion Sort
● Real-time updates
● Deadline-based sorting*/

public class TailorShop {
	
	public static void insertionsort(List<ClothingOrder> co) {
		for(int i=1;i<co.size();i++) {
			ClothingOrder key = co.get(i);
			LocalDate currdate = key.date;
			int prev = i-1;
			//isBefore(): Checks if prev.date is an earlier date than currdate
			while(prev >= 0 && co.get(prev).date.isAfter(currdate)) {
				co.set(prev+1, co.get(prev));
				prev--;
			}
			co.set(prev+1, key);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of clothing to be delivered");
		int n = sc.nextInt();
		sc.nextLine();
		
		List<ClothingOrder> clist = new ArrayList<>();
		for(int i =0;i <n; i++) {
		    System.out.println("Enter the name of the clothing:");
		    String name = sc.nextLine();
		    System.out.println("Enter the delivery data (yyyy-mm-dd) of the "+ name);
		    String sdate = sc.nextLine();
		    LocalDate date = LocalDate.parse(sdate);
		    
		    ClothingOrder co = new ClothingOrder(name,date);
		    clist.add(co);
		}
		insertionsort(clist);
		System.out.println("List Sorted as per the delivery date:");
		System.err.println(clist);
		
	}
}
