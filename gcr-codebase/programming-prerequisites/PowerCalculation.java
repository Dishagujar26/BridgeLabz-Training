import java.util.Scanner;

// Creating class with name PowerCalculation indicating the purpose is to calculate the result of base raised to the exponent
public class PowerCalculation {

    public static void main(String[] args) {

        // Create Scanner object sc to read input from keyboard
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base Value: ");

        // Create a int variable base and store value entered by user
        int base = sc.nextInt();

        System.out.print("Enter Exponent Value: ");

        // Create a int variable exponent and store value entered by user
        int exponent = sc.nextInt();

        // Create a int variable power and use the method Math.pow() present in lang package
        double power = Math.pow(base,exponent);

        // Display the calculated power  
        System.out.println("The calculated power is "+ power);
    }
}