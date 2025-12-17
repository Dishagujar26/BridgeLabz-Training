import java.util.Scanner;

// Creating class with name AddTwoNumbers indicating the purpose is to calculate addition of two numbers.
public class AddTwoNumbers {

    public static void main(String[] args) {

        // Create Scanner object sc to read input from keyboard
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");

        // Create an int variable x and store first number entered by user
        int x = sc.nextInt();

        System.out.print("Enter second number: ");

        // Create an int variable y and store second number entered by user
        int y = sc.nextInt();


        // Calculate and display the addition of two numbers
        System.out.println("Average of three numbers is: " + (x+y));
    }
}
