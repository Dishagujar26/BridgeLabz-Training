import java.util.Scanner;
import java.util.Arrays;

public class ReverseOrder {  
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        // Get the input value
        int number = sc.nextInt();
        int originalNumber = number; // store original number
        
        // Variable to keep count of digits   
        int count = 0;
        
        // Count digits
        while(number > 0){
            number /= 10;
            count++;
        }
        
        // Declare the array
        int []digitArray = new int[count];
        
        int index = 0;
        number = originalNumber; 
        
        while(number > 0){
            int digit = number % 10;
            digitArray[index] = digit;
            number /= 10;
            index++;
        }
        
        System.out.print("Reversed number digits: ");
        System.out.print(Arrays.toString(digitArray));
        
        // Closing the Scanner Stream
        sc.close();
    }
}

