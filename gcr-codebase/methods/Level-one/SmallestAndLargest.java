import java.util.Scanner;

// Create SmallestAndLargest Class to compute the Smallest and Largest number
public class SmallestAndLargest {
   
    // Method to compute the Smallest and Largest number
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
	    int small = Integer.MAX_VALUE;
		int large = Integer.MIN_VALUE;
		
		if(number1 < number2){
		    if(number1 < number3){
                small = number1;
            }
            else{
                small = number3;
            }
        }
        else{
        	if(number2 < number3){
                small = number2;
            }
            else{
                small = number3;
            }	
	    }
		
		if(number1 > number2){
		    if(number1 > number3){
                large = number1;
            }
            else{
                large = number3;
            }
        }
        else{
        	if(number2 > number3){
                large = number2;
            }
            else{
                large = number3;
            }	
	    }
		return new int[]{small,large};
	}
	
    public static void main(String[] args) {
		// Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get the input value
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
	   
		// Call the method
		int []result  = SmallestAndLargest.findSmallestAndLargest(number1,number2,number3);
        System.out.println("Smallest: "+result[0] +" Largest: "+result[1]);
        
        // Close the Scanner object
        sc.close(); 
	}   
     
}