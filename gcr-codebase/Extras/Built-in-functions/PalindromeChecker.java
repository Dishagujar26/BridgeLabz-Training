import java.util.Scanner;
// create PalindromeChecker class to check if a string is palindrome or not 
public class PalindromeChecker {
	
    // Method to check palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Compare characters from both the ends
        while (start<end){
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method to display result
    public static void displayResult(boolean result) {
        if (result) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String is NOT a Palindrome");
        }
    }
	
	public static void main(String[] args) {
        // create Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();

        // Check palindrome
        boolean result = isPalindrome(text);

        // Display result
        displayResult(result);

        // close Scanner stream
        sc.close();
    }
}
