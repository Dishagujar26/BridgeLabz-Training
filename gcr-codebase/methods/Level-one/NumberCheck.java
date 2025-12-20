import java.util.Scanner;

// Create NumberCheck Class to check whether a number is positive, negative, or zero.
public class NumberCheck  {
   
    // Method to check the number 
    public int checkNumber(int number) {
        if(number < 0){
		    return -1;
		}
		else if(number > 0){
		    return 1;
		}
		else{
		    return 0;
		}
    }
   
    public static void main(String[] args) {
		// Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		NumberCheck numberCheck = new NumberCheck();
		
		// Take input for number
		int number = sc.nextInt();
		
		// Get the the result
	    int result = numberCheck.checkNumber(number); 
        		  	
        System.out.println(result);
        
	    // Close the Scanner object
        sc.close(); 
	}   
     
}
