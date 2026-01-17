package com.bl.generics.smartwarehousemanagementsystem;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Storage<Electronic> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        int choice;

        do {
            System.out.println("1. Add Electronics");
            System.out.println("2. Add Groceries");
            System.out.println("3. Add Furniture");
            System.out.println("4. Display Electronics");
            System.out.println("5. Display Groceries");
            System.out.println("6. Display Furniture");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Item ID: ");
                    String eId = sc.next();
                    System.out.print("Enter Quantity: ");
                    int eQty = sc.nextInt();
                    electronicsStorage.addItem(new Electronic(eQty, eId));
                    break;

                case 2:
                    System.out.print("Enter Item ID: ");
                    String gId = sc.next();
                    System.out.print("Enter Quantity: ");
                    int gQty = sc.nextInt();
                    groceriesStorage.addItem(new Groceries(gQty, gId));
                    break;

                case 3:
                    System.out.print("Enter Item ID: ");
                    String fId = sc.next();
                    System.out.print("Enter Quantity: ");
                    int fQty = sc.nextInt();
                    furnitureStorage.addItem(new Furniture(fQty, fId));
                    break;

                case 4:
                    WarehouseUtil.displayItems(electronicsStorage.getItems());
                    break;

                case 5:
                    WarehouseUtil.displayItems(groceriesStorage.getItems());
                    break;

                case 6:
                    WarehouseUtil.displayItems(furnitureStorage.getItems());
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
