/*
20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/

import java.util.Scanner;
public class FestivalLuckyDraw{
    public static void main(String []args){
	    Scanner sc = new Scanner(System.in);
		
		String choice = "";
		do{
		    System.out.println("Please choose a number");
			int number = sc.nextInt();
			
			if(number % 3 == 0 && number % 5 == 0){
			    System.out.println("Hurraaayyy!!!\nYou Won A Gift.");
			}
			else{
			    System.out.println("Sorry, You Didn't Won Anything!!");
			}
			System.out.println("Do you want to continue? (yes/no)");
	        choice = sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
	    
		// close Scanner
		sc.close();
	}
		
}