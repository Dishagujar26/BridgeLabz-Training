import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// variable to get user choice 
        String choice = "yes";

        do {
            System.out.println("Enter what type of coffee you want: ");
            System.out.println("1.Latte\n2.Cappuccino\n3.Decaf\n4.Mocha\n5.Americano\n6.Black");
			String coffeeName = sc.next(); 
			
			System.out.println("Enter the quantity: ");
            int quantity = sc.nextInt();

            double price = 0.0;

            switch (coffeeName) {
                case "Latte":
                    price = 150;
                    break;

                case "Cappuccino":
                    price = 180;
                    break;

                case "Decaf":
                    price = 140;
                    break;

                case "Mocha":
                    price = 200;
                    break;

                case "Americano":
                    price = 160;
                    break;

                case "Black":
                    price = 120;
                    break;

                default:
                    System.out.println("Sorry, we don't serve that coffee! ");
                    continue;
            }

            generateBill(quantity, price);
            System.out.println("Do you want to continue? (yes/exit)");
            choice = sc.next();

        }while(!choice.equalsIgnoreCase("exit"));

        // close the scanner stream
        sc.close();
    }

    // method to calculate the price 
    public static double calculatePrice(int quantity, double price){
	    return quantity * price;
	}
	
	// method to generate bill of the counter order 
    public static void generateBill(int quantity, double price) {
	    double GST = 0.18;   // 18 percent gst 
	    double bill = calculatePrice(quantity, price);
        double gstAmount = bill * GST;
        double finalBill = bill + gstAmount;
		
        System.out.println("Total bill of the Order is: "+ bill+ " /- ");
        System.out.println("Total GST applied to the order: "+ gstAmount+ " /- ");
        System.out.println("Final bill (incl. GST): "+ finalBill+ " /- ");
		
    }
}
