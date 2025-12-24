import java.util.Scanner;
// create FibonacciGenerator class to compute fibonnachi series of a number
public class FibonacciGenerator {
    // Method to calculate and print Fibonacci sequence
    public static void printFibonacci(int n) {

        int a = 0, b = 1;

        // Print Fibonacci numbers
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take number of terms
        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        // Generate Fibonacci sequence
        printFibonacci(n);

        sc.close();
    }

}
