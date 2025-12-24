import java.util.Scanner;
// Create a ReverseString class to reverse a string without using built-in method 

public class ReverseString {

    // method to reverse a string 
    public static String reverse(String string){
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
		return sb.toString();
        
    }
			    
    public static void main(String[] args) {
	    
		// scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();
		
        System.out.println("Original String "+ text);
		System.out.println("Reversed String "+ ReverseString.reverse(text));

        // close Scanner stream
        sc.close();
    }
}