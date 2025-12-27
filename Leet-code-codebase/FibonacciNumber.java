import java.util.Scanner;

public class FibonacciNumber {

    // Method to find the nth Fibonacci number
    public static int fibonacci(int n) {

        // Base cases
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1;

        // Calculate Fibonacci using iteration
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Call Fibonacci method
        int result = fibonacci(n);

        // Output result
        System.out.println("Fibonacci number at position " + n + " is: " + result);

        sc.close();
    }
}
