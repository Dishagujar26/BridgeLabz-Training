import java.util.Scanner;

public class PalindromeNumber {  
   
    // method to check if a number is palindrome or not 
	public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original  = x;
        int ans=0;
        for (; x != 0; x /= 10) {
            if (ans < Integer.MIN_VALUE / 10 || ans > Integer.MAX_VALUE / 10) {
                return false;
            }
              ans = ans * 10 + x % 10;
        }
        if (ans == original){
            return true;
        }
        else{
            return false;
        }
        
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Is the number palindrome "+ PalindromeNumber.isPalindrome(number));
		
		sc.close();
	}
}