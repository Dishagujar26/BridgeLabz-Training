import java.util.Scanner;
// create MaximumOfThree class to find the maximum of three numbers 
public class MaximumOfThree {

    // Method to take three integer
    public static int[] takeInput(Scanner sc) {
        int[] nums = new int[3];

        System.out.println("Enter first number:");
        nums[0] = sc.nextInt();
        System.out.println("Enter second number:");
        nums[1] = sc.nextInt();
        System.out.println("Enter third number:");
        nums[2] = sc.nextInt();

        return nums;
    }

    // Method to find maximum of three numbers
    public static int findMaximum(int a,int b,int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
	
	public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        int[] numbers = takeInput(sc);
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);

        System.out.println("Maximum number is: " + max);

        // close the Scanner stream
        sc.close();
    }
}
