// Create SwitchCalculator class to perform basic arithmetic operations using switch case 
import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
	    // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Get input value for number1
        int number1 = sc.nextInt();
		
		// Get input value for number2
        int number2 = sc.nextInt();
		    
		// Get input value for operation
        String operation = sc.next();
		
	    switch(operation){
		    
			case "+":
			    System.out.println("The addition is "+ (number1 + number2));
				break;
				
			case "-":
			    System.out.println("The substraction is "+ (number1 - number2));
			    break;
				
            case "*":
			    System.out.println("The multiplication is "+ (number1 * number2));
			    break;
				
			case "/":
			    System.out.println("The division is "+ (number1 / number2));
                break;
				
			default:
			    System.out.println("Invalid Operator");
			
        }
		
		// Closing the Scanner Stream
		sc.close();
    }
}
