import java.util.Scanner;

// Create FizzBuzzProgram Class to print user number using while loop

public class FizzBuzzProgram{  
	public static void main(String []args){
	    
		// Create a Scanner object 
        Scanner sc = new Scanner(System.in);
		
        // Get input value of number        		
		int number = sc.nextInt();
		
		// Loop from 1 to number using while loop and check each value for FizzBuzz
		int i = 1;
		while(i <= number){
		    if(i % 3 == 0 && i % 5 == 0){
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
			i++;
		}
		
		// Closing the Scanner Stream
		sc.close();
         		
    }
}
