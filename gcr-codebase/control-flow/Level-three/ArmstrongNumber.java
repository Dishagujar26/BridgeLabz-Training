// Create ArmstrongNumber Class to chekc if a number is Armstrong Number
import java.util.Scanner;

public class ArmstrongNumber{  
	public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
        // Get input value of number        		
		int number = sc.nextInt();
		
        // Store the original number 
		int originalNumber =  number;
		
		int sum = 0;
		
		// While loop to calculate the sum of digits of number 
        while(number > 0){
		    int digit = number % 10;
			sum += Math.pow(digit,3);
			number /= 10;
		}
		
		System.out.println(originalNumber == sum ? "Armstrong Number" : "Not Armstrong Number");
		
		// Closing the Scanner Stream
		sc.close();
         		
    }
}