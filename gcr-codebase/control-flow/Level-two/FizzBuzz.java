import java.util.Scanner;

// Create FizzBuzz Class to print user number 
public class FizzBuzz{  
	public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
        // Get input value of number        		
		int number = sc.nextInt();
		
		// Loop from 1 to number and check each value for FizzBuzz
		for(int i=1; i<=number; i++){
		    if(i % 5 == 0 && i % 3 == 0){
			    System.out.println("FizzBuzz");
			}
			else if(i % 5 == 0){
                System.out.println("Buzz");			
			}
			else if(i % 3 == 0){
                System.out.println("Fizz");			
			}
		    else{
			    System.out.println(i);
			}
		}
		
		// Closing the Scanner Stream
		sc.close();
         		
    }
}
