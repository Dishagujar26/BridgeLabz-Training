
import java.util.Scanner;

//creating a class to perform basic arithmetic operations on two numbers

public class Calculator {
    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        //addition of the two numbers
        double addition = number1 + number2;

        //subtraction of the two numbers
        double subtraction = number1 - number2;

        //multiplication of the two numbers
        double multiplication = number1 * number2;

        //division of the two numbers
        double division = (number2 != 0) ? number1 / number2 : 0;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 + " " + number2 + " is " + addition + " , " + subtraction + " , "+ multiplication + " and " + division);
    }
}
