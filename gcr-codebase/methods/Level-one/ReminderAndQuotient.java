import java.util.Scanner;

// Create ReminderAndQuotient Class to compute reminder and quotient of a number
public class ReminderAndQuotient {
   
    // Calculate reminder and quotient of a number
    public static int[] findRemainderAndQuotient(int number1, int number2){	
        int reminder = number1 % number2;
		int quotient = number1 / number2;
		
		return new int[]{reminder,quotient};
	}
	
    public static void main(String[] args) {
		// Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get the input value
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		
		ReminderAndQuotient reminderAndQuotient = new ReminderAndQuotient();
	   
		// Call the method
		int []result  = ReminderAndQuotient.findRemainderAndQuotient(number1,number2);
        System.out.println("Reminder: "+result[0] +" Quotient: "+result[1]);
        
        // Close the Scanner object
        sc.close(); 
	}   
     
}