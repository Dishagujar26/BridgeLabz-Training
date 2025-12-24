import java.util.Scanner;

// create FactorialRecursion class to calculate factorial of a number through recursion
public class FactorialRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input number
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        // Calculate factorial
        int result = factorial(n);

        System.out.println("Factorial is: " + result);

        // close Scanner object 
        sc.close();
    }

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }
}
