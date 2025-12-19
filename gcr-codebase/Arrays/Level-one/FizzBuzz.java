import java.util.Scanner;
import java.util.Arrays;


public class FizzBuzz{
    public static void main(String []args){
	    Scanner sc = new Scanner(System.in);
		
		// Get user input
		int number = sc.nextInt();
		
		// Declare String array
		String []array = new String[number];
		
		// Check for positive integer number
		if(number > 0){
		    for(int i=0; i<number; i++){
		        if(i % 5 == 0 && i % 3 == 0){
			        array[i] = "FizzBuzz";
			    }
			    else if(i % 5 == 0){
                    array[i] = "Buzz";	
			    }
			    else if(i % 3 == 0){
                    array[i] = "Fizz";			
			    }
		        else{
			        array[i] = String.valueOf(i);
			    }
		    }
		}        		
		// Display array
		System.out.println(Arrays.toString(array));

        
		// Closing the Scanner Stream
		sc.close();
	}
}