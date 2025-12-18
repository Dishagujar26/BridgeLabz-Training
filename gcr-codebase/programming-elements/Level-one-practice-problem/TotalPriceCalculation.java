import java.util.Scanner;

//creating a class name TotalPriceCalculation to calculate total price of an item
public class TotalPriceCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit price of an item:");
        double unitPrice = sc.nextDouble();

        System.out.println("Enter quantity of the item:");
        double quantity = sc.nextDouble();

        //create a variable for calculating total price (unit price * quantity)
        double totalPrice = unitPrice * quantity;

        System.out.println("The total price of the item is " + totalPrice);
    }
}
