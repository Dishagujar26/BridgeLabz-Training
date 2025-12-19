import java.util.Scanner;

// Create SumNaturalNumbers Class to find sum of n natural number using while loop and formulaa n*(n+1)/2

public class SumNaturalNumbers{  
	public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
        // Get input value of number        		
		int number = sc.nextInt();
		
		//calculate using formula n*(n+1)/2
		int sum =  number * (number + 1 ) / 2;
		
		int whileSum = 0;
		
		// Calculate sum using while loop
		int i=1;
        while(i <= number){
            whileSum += i;
		    i++;
        }
		System.out.println("Are they equal "+ (whileSum == sum));
		
		// Closing the Scanner Stream
		sc.close();
         		
    }
}