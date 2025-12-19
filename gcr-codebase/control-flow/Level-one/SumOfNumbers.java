import java.util.Scanner;

// Create SumOfNumbers Class to find sum of numbers until the user enters 0

public class SumOfNumbers{
    public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
        // Get input value of number        		
		double x = sc.nextDouble();
		double total = 0.0;
		
		// Keep taking number until user enter zero
        while(x != 0){
            total += x;
		    x = sc.nextDouble();
        }
		System.out.println("The total is "+ total);
		
		// Closing the Scanner Stream
		sc.close();
         		
    }
}