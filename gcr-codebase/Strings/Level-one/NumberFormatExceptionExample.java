import java.util.Scanner;

// Class NumberFormatExceptionExample to  to demonstrate NumberFormatException
public class NumberFormatExceptionExample{

    // method to handle exception
    public static void handleException(String text){
	    
		try{
		    int number = Integer.parseInt(text);
		    
		}
		catch(NumberFormatException e){
		    System.out.println("The exception has occured "+ e.toString());
		}
		catch(Exception e){
		    System.out.println("The exception has occured "+ e.toString());
		}
		    
    }

    public static void main(String[] args){
		// Create scanner object
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        
		NumberFormatExceptionExample.handleException(text);
			
		//close scanner stream
		sc.close();
	}
}