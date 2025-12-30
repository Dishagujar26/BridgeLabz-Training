/*
  Shopkeeper’s Discount Dashboard 
  A shopkeeper gives discounts based on total bill:
  Input item prices in a for-loop.
  Use if-else for discount logic.
  Use proper indentation, constants, and comments.
  
*/
import java.util.Scanner;

public class DiscountDashboard {

   // method to calculate discount
    public static double calculateDiscount(double totalPrice) {
        if (totalPrice >= 10000) return 0.20;
        if (totalPrice >= 5000)  return 0.10;
        if (totalPrice >= 2000)  return 0.05;
        return 0.0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of items in the cart: ");
        int totalItems = sc.nextInt();

        // validate user input 
        if (totalItems <= 0) {
            System.out.println("Cart cannot be empty.");
            return;
        }

        sc.nextLine();
        String[] itemNames = new String[totalItems];
        double[] itemPrices = new double[totalItems];

        double totalPrice = 0.0;

        // input items
        for (int i = 0; i < totalItems; i++) {
            System.out.print("Enter name of item " + (i+1) + ": ");
            itemNames[i] = sc.nextLine();

            System.out.print("Enter price of item " + (i+1) + ": ");
            double price = sc.nextDouble();
            sc.nextLine();

            // validate user input for price
            if (price<0) {
                System.out.println("Invalid price. Try again.");
                i--; // decrement the value, run again
                continue;
            }

            itemPrices[i] = price;
            totalPrice += price;
        }

        // display Items
        System.out.println("\n========== CART DETAILS ==========");
        System.out.println("Item Name | Price");
        System.out.println("------------------");

        // loop to prin the item and thier prices
        for (int i = 0; i<totalItems; i++) {
            System.out.println(itemNames[i] + " | " + itemPrices[i]);
        }

        double discountRate = calculateDiscount(totalPrice);
        double discountAmount = totalPrice * discountRate;
        double finalPrice = totalPrice - discountAmount;

        // Dashboard
        System.out.println("\n====== SHOPKEEPER DISCOUNT DASHBOARD ======");
        System.out.println("Total Price        : " + totalPrice);
        System.out.println("Discount Applied   : " + (discountRate * 100) + "%");
        System.out.println("Discount Amount    : " + discountAmount);
        System.out.println("Final Payable Amt  : " + finalPrice);

        sc.close();
    }
}

