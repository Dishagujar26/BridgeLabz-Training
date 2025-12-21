import java.util.Scanner;
// Create NumberCheck class to check the number even or odd
public class NumberCheck{

    // Method to check even 
    public boolean isEven(int a) {
        if(a % 2 == 0){
		    return true;
		}
		return false;
	}
	
	// Method to check poditve number 
    public boolean isPositive(int a) {
        if(a > 0){
		    return true;
		}
		return false;
	}
	
	// Method to compare two numbers 
    public int compare(int a, int b) {
  
	   // Check first and last element of array 
		if(a == b){
		    return 0;
		}
		else if(a > b){
		    return 1;    
	    }
		else{
		    return -1;
		}
		
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Array to store elements
        int[] numbers = new int[5];

        NumberCheck numberCheck = new NumberCheck();
		
        // Take input for the array
        for(int i=0; i<numbers.length; i++){
		    numbers[i] = sc.nextInt();
		}
        
		
        // Check the numbers
        for(int i=0; i< numbers.length; i++){
		    if(!numberCheck.isPositive(numbers[i])){
			    System.out.println("Negative");
			}
			else if(numberCheck.isEven(numbers[i])){
			    System.out.println("Even");
			}
			else{
			    System.out.println("Odd");
			}
    
		}
        
		int result = numberCheck.compare(numbers[0],numbers[numbers.length-1]);
        
        // Check first and last element of array 
		if(result == 0){
		    System.out.println("Equal");
		}
		else if(result == 1){
		    System.out.println("First greater than last");
	    }
		else{
		    System.out.println("First less than last");
		}

        // Close Scanner object
        sc.close();
    }
}