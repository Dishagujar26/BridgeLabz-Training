import java.util.Scanner;
// create PrimeNumberChecker class to check if a number is a prime or not 
public class PrimeNumberChecker {

    // Method to check whether a number is prime
    public static boolean isPrime(int num) {
		// only positve integer
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            // If divisible, number is not prime
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        boolean result = isPrime(number);

        if (result) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is NOT a Prime number");
        }

        // close Scanner stream
        sc.close();
    }
}
