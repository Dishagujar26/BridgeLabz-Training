import java.util.Scanner;

// Creating class with name AverageOfThreeNumbers indicating the purpose is to calculate average of three numbers.
public class AverageOfThreeNumbers {

    public static void main(String[] args) {

        // Create Scanner object sc to read input from keyboard
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");

        // Create an int variable x and store first number entered by user
        int x = sc.nextInt();

        System.out.print("Enter second number: ");

        // Create an int variable y and store second number entered by user
        int y = sc.nextInt();

        System.out.print("Enter third number: ");

        // Create an int variable z and store third number entered by user
        int z = sc.nextInt();

        // Calculate and display the average of three numbers
        System.out.println("Average of three numbers is: " + ((x + y + z) / 3));
    }
}