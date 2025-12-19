import java.util.Scanner;

// Create SumNumbers Class to find sum of numbers until the user enters 0 or negative number

public class SumNumbers{
    public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
        double total = 0.0;  // To store sum
		
		// Keep taking numbers until user enters 0 or negative
        while(true){
            double x = sc.nextDouble();  
            if(x <= 0){                  
                break;                   
            }
            total += x;                  
        }
		
		System.out.println("The total is " + total);
		
		// Closing the Scanner Stream
		sc.close();		
    }
}
