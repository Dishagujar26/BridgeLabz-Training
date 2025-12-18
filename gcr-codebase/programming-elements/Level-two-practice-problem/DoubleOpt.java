import java.util.Scanner;

//creating a class name DoubleOpt to perform double operations 
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter double values for a, b, and c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        //create a variable for computing operations with correct precedence
        double operation1 = a + b * c;
        double operation2 = a * b + c;
        double operation3 = c + a / b;
        double operation4 = a % b + c;

        System.out.println("The results of Double Operations are "+ operation1 + ", " + operation2 + ", " + operation3 + ", " + operation4);
    }
}
