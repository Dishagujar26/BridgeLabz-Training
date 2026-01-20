package com.bl.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 4. FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the back-end uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization
 */
public class FlashDealz {

	// Quick Sort by discount (descending)
	static void quickSort(List<Product> list, int low, int high) {
		if (low < high) {
			int p = partition(list, low, high);
			quickSort(list, low, p - 1);
			quickSort(list, p + 1, high);
		}
	}

	static int partition(List<Product> list, int low, int high) {
		double pivot = list.get(high).discount;
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (list.get(j).discount > pivot) { // higher discount first
				i++;
				swap(list, i, j);
			}
		}
		swap(list, i + 1, high);
		return i + 1;
	}

	static void swap(List<Product> list, int i, int j) {
		Product temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of products you want to add : ");
		int n = sc.nextInt();
		sc.nextLine();
		List<Product> products = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name of the product number "+ (i+1));
			String name = sc.nextLine();
			System.out.println("Enter the discount on product number "+ (i+1));
			double ds = sc.nextDouble();
			
			Product p = new Product(name, ds);
			products.add(p);
		}

		quickSort(products, 0, products.size() - 1);

		for (Product p : products) {
			System.out.println(p.name + " - " + p.discount + "%");
		}
	}
}
