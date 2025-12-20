import java.util.Scanner;

// Create Chocolates Class print the number of chocolates each child will get and remaining
public class Chocolates {
   
    // Calculate number of chocolates for each child
    public static int[] chocolatesCalculation(int numberOfchocolates, int numberOfChildren) {	
        int chocolatesChildget = numberOfchocolates / numberOfChildren;
		int remaining = numberOfchocolates % chocolatesChildget;
		
		return new int[]{chocolatesChildget,remaining};
	}
	
    public static void main(String[] args) {
		// Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get the input value
		int numberOfchocolates  = sc.nextInt();
		int numberOfChildren = sc.nextInt();
	   
		// Call the method
		int []result  = Chocolates.chocolatesCalculation(numberOfchocolates,numberOfChildren);
        System.out.println("Chocolates each child get : "+result[0] +" Remaining chocolates: "+result[1]);
        
        // Close the Scanner object
        sc.close(); 
	}   
     
}