// Create HarshadNumber Class to chekc if a number is Harshad Number
import java.util.Scanner;

public class HarshadNumber{  
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
			sum += digit;
			number /= 10;
		}
		
		System.out.println(originalNumber % sum == 0 ? "Harshad Number" : "Not Harshad Number");
		
		// Closing the Scanner Stream
		sc.close();
         		
    }
}