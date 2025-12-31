/*
18. Currency Exchange Kiosk 
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.Scanner;

public class CurrencyExchangeKiosk{
    public static void main(String[]args){
	    Scanner sc = new Scanner(System.in);
		String choice2 = "";
		System.out.println("\nWelcome To The Currency Exchange Kiosk\n");
		
		do{
		
		    System.out.println("Enter the amount in INR");
		    double amountINR = sc.nextDouble();
		    System.out.println("Please Select the Currency Exchange\n1.US DOllar\n2.Euro\n3.Japanese Yen\n4.Pound Sterling\n5.Chinese Yuan\n6.Russian Ruble");
		    int choice = sc.nextInt();
		
		    switch(choice){
		       case 1:
			        System.out.println("The current amount in INR is "+ amountINR);
			        System.out.printf("The amount in US Dollar is %.2f USD %n" ,(amountINR *  0.0111));
			        break;
				
			    case 2:
			        System.out.println("The current amount in INR is "+ amountINR);
			        System.out.println("The amount in Euro is "+ (amountINR *  0.00947)+" EUR");
			        break;
				
			    case 3:
			        System.out.println("The current amount in INR is "+ amountINR);
			        System.out.println("The amount in Japanese Yen is "+ (amountINR *  1.74)+" JPY");
			        break;
				
			    case 4:
			        System.out.println("The current amount in INR is "+ amountINR);
			        System.out.println("The amount in Pound Sterling is "+ (amountINR *   0.0083)+" GBP");
			        break;    
				
			    case 5:
			        System.out.println("The current amount in INR is "+ amountINR);
			        System.out.println("The amount in Chinese Yuan is "+ (amountINR *   0.078)+" CNY");
			        break; 
				
			    case 6:
			        System.out.println("The current amount in INR is "+ amountINR);
			        System.out.println("The amount in Russian Ruble is "+ (amountINR *   0.88)+" RUB");
			        break; 
				
			    default:
			        System.out.println("Currency Exchange For The Selected Currency Not Available!");
			
		    }
			System.out.println("Do you want to continue? (yes/no)");
			choice2 = sc.next();
		}while((choice2.equalsIgnoreCase("yes"));
		System.out.println("Thank You For Using The System!");
	
        sc.close();	
	}
}
				
			
			
			
		