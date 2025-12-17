import java.util.Scanner;

// Creating class with name SimpleInterest indicating the purpose is to calculate simple interest.
public class SimpleInterest {

    public static void main(String[] args) {

        // Create Scanner object sc to read input from keyboard
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");

        // Create a variable principal and store value entered by user
        double principal = sc.nextDouble();

        System.out.print("Enter rate of interest: ");

        // Create a variable rate and store value entered by user
        double rate = sc.nextDouble();

        System.out.print("Enter time period (in years): ");

        // Create a variable time and store value entered by user
        double time = sc.nextDouble();

        // Create a variable simpleInterest and calculate using formula (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Display the calculated simple interest
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
