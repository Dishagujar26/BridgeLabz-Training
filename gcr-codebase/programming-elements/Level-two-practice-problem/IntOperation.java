import java.util.Scanner;

//creating a class name IntOperation to perform integer operations 
public class IntOperation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer values for a, b, and c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //creating a variable for computing operations with correct precedence
        int operation1 = a + b * c;     
        int operation2 = a * b + c;    
        int operation3 = c + a / b;     
        int operation4 = a % b + c;     

        System.out.println("The results of Int Operations are " + operation1 + ", " + operation2 + ", " + operation3 + ", " + operation4);
    }
}
