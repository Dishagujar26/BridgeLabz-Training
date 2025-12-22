import java.util.Scanner;

// Class IllegalArgumentExceptionExample to demonstrate Illegal Argument ExceptionExample
public class IllegalArgumentExceptionExample{

    // method to handle exception
    public static void handleException(String s){
	    
		try{
		    int startIdx = 1;
		    int endIdx = 0;
            String substring = s.substring(startIdx,endIdx);
		}
		catch(IllegalArgumentException e){
		    System.out.println("The exception has occured "+ e.toString());
		}
		catch(Exception e){
		    System.out.println("The exception has occured "+ e.toString());
		}
		    
    }

    public static void main(String[] args){
		// Create scanner object
        Scanner sc = new Scanner(System.in);

        String string = sc.next();
        
		IllegalArgumentExceptionExample.handleException(string);
			
		//close scanner stream
		sc.close();
	}
}