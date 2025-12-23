import java.util.Scanner;

// Class ArrayLengthCalculation to count length of array 
public class ArrayLengthCalculation{
	
    // method to count length without using built-in method
    public static int fiLength(String string){
      
	    int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } 
		catch(StringIndexOutOfBoundsException e){
	        return length;   
		}

    }

    public static void main(String[] args){
		// Create scanner object
        Scanner sc = new Scanner(System.in);
        
		String string = sc.next();
		
	    System.out.println("The length calculated without built-in method : "+ ArrayLengthCalculation.countLength(string));
	    System.out.println("The length calculated with built-in method : "+ string.length());
	    
		
		//close scanner stream
		sc.close();
	}
}