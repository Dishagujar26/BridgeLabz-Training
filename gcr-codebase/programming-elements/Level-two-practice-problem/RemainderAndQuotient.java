import java.util.Scanner;

//creating a class to calculate remainder and quotient of two numers

public class RemainderAndQuotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int number1 = sc.nextInt();
		
		System.out.println("Enter the number2 ");
        int number2 = sc.nextInt();
		
		int quotient = number1 / number2;  
        int remainder = number1 % number2; 

        System.out.println("The remainder of two numbers is "+ remainder + " and quotient is " + quotient);
    }
}
