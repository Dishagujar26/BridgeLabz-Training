import java.util.Scanner;

// Create CountDown Class to count down the number from the user input value to 1
public class ForCountDown{
    public static void main(String []args){
	    
		// Create a Scanner object 
	    Scanner sc = new Scanner(System.in);
		
		// Get input value of number
		int number = sc.nextInt();
		
		// Prit the count down using for loop 
		for(int i=number; i>0; i--){
		    System.out.println(i);
		}
		
		// Closing the Scanner Stream
		sc.close();
	}
	
}
			
		