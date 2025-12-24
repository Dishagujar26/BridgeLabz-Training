import java.util.Scanner;
// create a class BasicCalculator to perform basic arithmetic operations
public class BasicCalculator {

   // method to to perform addition operation
    public static double add(double a, double b) {
        return a + b;
    }

	// method to to perform substraction operation
    public static double subtract(double a, double b) {
        return a - b;
    }
    
	// method to to perform multiplication operation
    public static double multiply(double a, double b) {
        return a * b;
    }
	
	// method to to perform division operation
    public static double divide(double a, double b) {
        return a / b;
    }
	
	public static void main(String[] args) {
		//create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        System.out.println("Choose operation: +  -  *  /");
        char op = sc.next().charAt(0);  // there is no next method for char
        double result = 0;

        switch (op) {
            case '+': result = add(a, b); break;
            case '-': result = subtract(a, b); break;
            case '*': result = multiply(a, b); break;
            case '/': result = divide(a, b); break;
            default:
                System.out.println("Invalid operation");
        }
        System.out.println("Result: " + result);

        // close Scanner object
        sc.close();
    }
}
