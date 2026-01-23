package com.bl.day9.ecommerceproductinventory;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductTree bst = new ProductTree();

		while (true) {
			System.out.println("\n1. Add Products");
			System.out.println("2. Delete Products");
			System.out.println("3. Lookup Products");
			System.out.println("4. Display All Products");
			System.out.println("5. Update Products");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt(); sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter the SKU Number: ");
				int sku = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Product Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Product Price: ");
				Double price = sc.nextDouble();
				bst.root = bst.insert(bst.root,sku, name, price);
				break;

			case 2:
				System.out.print("Enter SKU Number to Delete: ");
				sku = sc.nextInt();
				bst.root = bst.delete(bst.root, sku);
				break;

			case 3:
				System.out.print("Enter SKU Number to Search: ");
				sku = sc.nextInt();
				MusicNode found = bst.search(bst.root, sku);
				if (found != null)
					System.out.println("Student Found: " + found.SKU + " " + found.productName+" "+ found.productPrice);
				else
					System.out.println("Product not found.");
				break;
				
			case 4:
				System.out.println("All Products (Sorted by SKU Number):");
				bst.inorder(bst.root);
				break;

			case 5:
				System.out.println("Enter the SKU of Product to update");
				sku = sc.nextInt();
				System.out.println("Enter the New Product Price");
				price = sc.nextDouble();
				
				MusicNode foundnode = bst.update(bst.root, sku, price);
				if (foundnode != null) {
					System.out.println("Price updated successfully!");
				    System.out.println(foundnode.SKU+" "+ foundnode.productName+" "+ foundnode.productPrice);
			    }
				else
					System.out.println("Product with "+ sku +" not found!!");

				break;
			case 6:
				System.out.println("Thank You...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid choice! Try again.");
			}
		}
	}
}
