
//Creating a class with name FeeDiscountCalculation to calculate discount on fee
public class FeeDiscountCalculation  {
    public static void main(String[] args) {

        //create a variable to store the original fee amount
        int fee = 125000;

        //create a variable to store the discount percentage
        int discountPercent = 10;

        //create a variable to calculate and store the discount amount
        int discount = (fee * discountPercent)/100;

        //create a variable to calculate and store the fee after discount
        int payFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + payFee);
    }
}
