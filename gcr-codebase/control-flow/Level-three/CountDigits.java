// Create CountDigits Class to count the number of digits in a number 
import java.util.Scanner;

public class CountDigits{  
	public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
        // Get input value of number        		
		int number = sc.nextInt();
		
		// Create a variable to store number of digits 
		int count = 0;
		
		// While loop to count
        while(number > 0){
		    int digit = number % 10;
			count++;
			number /= 10;
		}
		System.out.println("Total Number of digits "+count);		
		
		// Closing the Scanner Stream
		sc.close();
         		
    }
}