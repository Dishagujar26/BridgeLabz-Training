import java.util.Scanner;

// Create NaturalNumbers Class to calculate sum of n natural numbers
public class NaturalNumbers{
   
    // Calculate sum using recursion
    public static int findSumUsingRecursion (int number){	    
		if(number == 1){
		    return 1;
		}
		else{
		    return number + findSumUsingRecursion(number -1 );
		}
	}
	
	// Calculate sum using formula
    public static int findSumUsingFormula (int number){	    
        int sum = (number*(number+1))/2;
		return sum;
	}
	
    public static void main(String[] args) {
		// Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get the input value
		int number  = sc.nextInt();
		
		if(number <= 0){
		    System.out.println("Enter a natural number");
			System.exit(0);
		}
	   
	    NaturalNumbers naturalNumbers = new NaturalNumbers();
		
		// Call the methods
		if(NaturalNumbers.findSumUsingFormula(number) == NaturalNumbers.findSumUsingRecursion(number)){
            System.out.println("They are equal");
		}
		else{
		    System.out.println("They are not equal");
        }
        
        // Close the Scanner object
        sc.close(); 
	}   
     
}