import java.util.Scanner;
// Create a PalindromeCheck class to check if a string is palindrome or not

public class PalindromeCheck {

    // method to check palindrome string  
    public static boolean checkPalindrome(String string){
	
	    // save the original string 
	    String original = string;
	    char[] charArray = string.toCharArray();
		int start =0;
		int end = charArray.length-1;
		
		// loop to reverse the char elems 
		while(start < end){
		    char temp = charArray[start];
		    charArray[start] = charArray[end];
			charArray[end] = temp;
			
			start++;
			end--;
		}
		
		StringBuilder sb = new StringBuilder();
		for(char ch : charArray){
		    sb.append(ch);
		}
		String reversed =  sb.toString();
		
		return reversed.equals(original);
        
    }
			    
    public static void main(String[] args) {
	    
		// scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();
		
        System.out.println("Are these strings palindromic ? "+ PalindromeCheck.checkPalindrome(text));

        // close Scanner stream
        sc.close();
    }
}