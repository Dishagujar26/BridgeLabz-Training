import java.util.Scanner;

public class AddBinary {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1; 
        int j = b.length() - 1; 
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
			    // Convert char to int
                sum += a.charAt(i) - '0'; 
                i--;
            }
            if (j >= 0) {
			    // Convert char to int
                sum += b.charAt(j) - '0'; 
                j--;
            }
			// Append the current binary digit
            result.append(sum % 2); 
			// Update carry
            carry = sum/2; 
        }
        
		// Reverse to get the correct order
        return result.reverse().toString(); 
    }
	
	public static void main(String []args){
        Scanner sc = new Scanner(System.in);	   
	
		String a = sc.next();
		String b = sc.next();
		System.out.println(AddBinary.addBinary(a, b));
	
	    sc.close();
	   
    }
}