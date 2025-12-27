import java.util.Scanner;

public class MissingNumber {

    // Method to find the missing number
    public static int missingNumber(int[] nums) {
        int n = nums.length;

        // Sum of numbers from 0 to n using formula
        int totalSum = (n * (n + 1)) / 2;

        // Sum of elements present in array
        int arrSum = 0;
        for (int num : nums) {
            arrSum += num;
        }

        // Missing number = totalSum - arrSum
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Find and print missing number
        int result = missingNumber(nums);
        System.out.println("Missing Number: " + result);

        sc.close();
    }
}

