import java.util.Scanner;

// Create CountDown Class to count down the number from the user input value to 1
public class CountDown{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		// Get input value of number
		int number = sc.nextInt();
		
		// Prit the count down using while loop 
		while(number > 0){
		    System.out.println(number);
			number--;
		}
		
		// Closing the Scanner Stream
		sc.close();
	}
	
}
			
		