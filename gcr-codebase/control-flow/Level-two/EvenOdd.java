import java.util.Scanner;

// Create EvenOdd Class to print odd and even numbers 

public class EvenOdd{  
	public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
        // Get input value of number        		
		int number = sc.nextInt();
		
		// Check if number is positive integer
		if(number > 0){
		    for(int i=1; i<=number; i++){
		        // Check the entered number is either even or odd
		        if(i % 2 == 0){
		            System.out.println("Even");
                }
			    else{
		            System.out.println("Odd");
			    }
				
		    }	
		}
			
		// Closing the Scanner Stream
		sc.close();
         		
    }
}