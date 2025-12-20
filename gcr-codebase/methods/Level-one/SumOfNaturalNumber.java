import java.util.Scanner;

// Create SumOfNaturalNumber Class to calculate the sum of natural numbers
public class SumOfNaturalNumber {
   
    // Method to calculate sum of natural numbers
    public int sumOfNumbers(int numbers){
		int sum= 0;
		
        for(int i=1; i<=numbers; i++){
		    sum += i;
        }
        return sum;		
    }
   
    public static void main(String[] args) {
		// Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get the input value;
		int number = sc.nextInt();
		
		SumOfNaturalNumber sumOfNaturalNumber = new SumOfNaturalNumber();
	   
		// Call the method
		int result = sumOfNaturalNumber.sumOfNumbers(number);
        System.out.println(result);
        
        // Close the Scanner object
        sc.close(); 
	}   
     
}