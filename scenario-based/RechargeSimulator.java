/*

10. Phone Recharge Simulator
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.

*/
import java.util.Scanner;

public class RechargeSimulator {

    public static void main(String[] args) {
        // Scanner for input 
        Scanner sc = new Scanner(System.in);
		
		//set initial balance 
        double balance = 5000.00;
        String repeat = "";

        do{
            System.out.println("\nChoose your mobile operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            // display all the available packs as per the selected operator
            System.out.println("\nAvailable Recharge Packs:");

            switch (choice) {
                
				// available packs for jio
                case 1: 
                    System.out.println("299  - 1.5GB/day for 28 days");
                    System.out.println("399  - 2.5GB/day for 28 days");
                    System.out.println("239  - 1.5GB/day for 22 days");
                    System.out.println("1299 - 2GB/day for 84 days");
                    break;

                // available packs for airtel
                case 2:
                    System.out.println("349  - 2GB/day, Unlimited 5G, Airtel Xstream Play");
                    System.out.println("449  - 3GB/day, Unlimited 5G, Access to 22+ OTTs");
                    System.out.println("1199 - 2.5GB/day, 84 days, Amazon Prime");
                    System.out.println("299  - 1GB/day, 28 days validity");
                    break;

                default:
                    System.out.println("Invalid operator selected");
                    continue;
            }
            
            System.out.print("\nEnter recharge amount: ");
            double amount = sc.nextDouble();
            boolean success = false;

            switch(choice){
                
				// compare amount for pack selection based on operator choice
                case 1:
                    if(amount == 299 && balance >= 299) {
                        System.out.println("Your recharge with 1.5GB/day for 28 days is successful");
                        balance -= 299;
                        success = true;
                    } 
                    else if(amount == 399 && balance >= 399) {
                        System.out.println("Your recharge with 2.5GB/day for 28 days is successful");
                        balance -= 399;
                        success = true;
                    } 
                    else if(amount == 239 && balance >= 239) {
                        System.out.println("Your recharge with 1.5GB/day for 22 days is successful");
                        balance -= 239;
                        success = true;
                    } 
                    else if(amount == 1299 && balance >= 1299) {
                        System.out.println("Your recharge with 2GB/day for 84 days is successful");
                        balance -= 1299;
                        success = true;
                    } 
                    else{
                        System.out.println("Invalid pack or insufficient balance");
                    }
                    break;

                case 2: 
                    if (amount == 349 && balance >= 349) {
                        System.out.println("Your recharge with 2GB/day, Unlimited 5G, Airtel Xstream Play is successful");
                        balance -= 349;
                        success = true;
                    } 
                    else if (amount == 449 && balance >= 449) {
                        System.out.println("Your recharge with 3GB/day, Unlimited 5G, Access to 22+ OTTs is successful");
                        balance -= 449;
                        success = true;
                    } 
                    else if (amount == 1199 && balance >= 1199) {
                        System.out.println("Your recharge with 2.5GB/day, 84 days, Amazon Prime is successful");
                        balance -= 1199;
                        success = true;
                    } 
                    else if (amount == 299 && balance >= 299) {
                        System.out.println("Your recharge with 1GB/day, 28 days validity is successful");
                        balance -= 299;
                        success = true;
                    } 
                    else {
                        System.out.println("Invalid pack or insufficient balance");
                    }
                    break;
            }
            if(success){
                System.out.println("Remaining Balance: " + balance);
            }
            System.out.print("\nDo you want to recharge again?(yes/no): ");
            repeat = sc.next();

        }while(repeat.equalsIgnoreCase("yes"));

        System.out.println("\nFinal Balance: " + balance);
		
		//close Scanner stream
        sc.close();
    }
}
