import java.util.Scanner;

// Creating a class named DiscountCalculation to calculate discount on fee 

public class DiscountCalculation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fee amount");
        int fee = sc.nextInt();
        System.out.println("Enter discount percentage");
        int discountPercent = sc.nextInt();

        //creating a variable for calculating discount amount
        int discount = (fee * discountPercent) / 100;

        //creating a variable for calculating final fee after discount
        int payFee = fee - discount;

        System.out.println("The discount amount is INR "+ discount +" and final discounted fee is INR "+ payFee);
    }
}
