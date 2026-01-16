package com.bl.day4.ticketpriceoptimizer;

/*
 4. EventManager – Ticket Price Optimizer (Quick Sort)
Story: An event booking portal sorts millions of tickets by price before showing the top 50
cheapest or most expensive. Since speed is crucial and data is unsorted, Quick Sort is used for
its average-case performance.
Key Concepts:
● Fast average time
● Recursive partitioning
● Ideal for large, random datasets
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ticket[] tickets = new Ticket[100];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Ticket Price");
            System.out.println("2. Sort Tickets");
            System.out.println("3. Show Top 5 Cheapest");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ticket price: ");
                    tickets[count++] = new Ticket(sc.nextDouble());
                    break;

                case 2:
                    TicketSorter.quickSort(tickets, 0, count - 1);
                    System.out.println("Tickets sorted by price.");
                    break;

                case 3:
                    for (int i = 0; i < Math.min(5, count); i++) {
                        System.out.println(tickets[i].price);
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
