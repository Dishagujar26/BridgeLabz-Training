package com.bl.day8.sortingstallsbycustomerfootfall;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
  7. FoodFest – Sorting Stalls by Customer Foot-fall (Merge Sort)
Story: At a multi-day food festival, organizers track foot-fall at every stall each day. They collect
daily logs from all zones (already sorted by count), and use Merge Sort to combine zone-wise
data into a master list for performance evaluation.
Concepts Involved:
● Merge Sort
● Combining multiple sorted data-sets
● Stability in data with equal values
*/
public class FoodFest {
	
	public static List<FootFall> merge(List<FootFall> list1, List<FootFall> list2) {
		int i = 0, j = 0;

		List<FootFall> unionList = new ArrayList<>();

		while (i < list1.size() && j < list2.size()) {
			if (list1.get(i).totalCustomer <= list2.get(j).totalCustomer) {
				unionList.add(list1.get(i));
				i++;
			} else {
				unionList.add(list2.get(j));
				j++;
			}
		}

		while (i < list1.size()) {
			unionList.add(list1.get(i));
			i++;
		}

		while (j < list2.size()) {
			unionList.add(list2.get(j));
			j++;
		}

		return unionList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of zone: ");
		int n = sc.nextInt();
		sc.nextLine();
	    List<FootFall> unionflist = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the name of zone number "+ (i+1));
			String zoneName = sc.nextLine();
			System.out.println("Enter the total number of food stalls in zone " + zoneName);
			int tc = sc.nextInt();
			sc.nextLine();
             
			// foot fall list are already sorted based on the customer number 
		    List<FootFall> flist = new ArrayList<>();
			for (int j = 0; j < tc; j++) {
                System.out.println("Enter the stall name:");
                String sname = sc.nextLine();
                System.out.println("Enter the stall number:");
                int sno = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the total customer numbre in "+ zoneName);
                int cno = sc.nextInt();
                sc.nextLine();
                
                FootFall fobj = new FootFall(sname,sno,cno);
                flist.add(fobj);
			}
			int count = 1;
			for(FootFall f : flist) {
				System.out.println("Foot Fall "+ count);
				System.out.println(f);
				count++;
			}
			if (i == 0) {
				unionflist = flist; // first zone list
			} else {
				unionflist = merge(unionflist, flist); // merge next zones
			}
		}
		for(FootFall uf : unionflist) {
			System.out.println(uf);
		}

	}
}
