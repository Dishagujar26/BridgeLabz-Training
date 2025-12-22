import java.util.Scanner;

// Class CompareStringStringIndexOutOfBoundsExceptionExampleArray to demonstrate String Index Out Of Bounds Exception
public class StringIndexOutOfBoundsExceptionExample{

    // method to generate exception
    public static void generateException(String s){
        char [] charArray = new char[s.length()];
        
		// create char array first
        for(int i=0; i<s.length(); i++){
            charArray[i] = s.charAt(i);			
        }	
        
		// use try catch block to handle exception 
		try{
		    for(int i=0; i<=charArray.length; i++){
			    System.out.println(charArray[i]);
			}
		}
		catch(StringIndexOutOfBoundsException e){
		    System.out.println("The exception has occured "+ e.getMessage());
		}
		catch(IndexOutOfBoundsException e){
		    System.out.println("The exception has occured "+ e.getMessage());
		}
		
    }

    public static void main(String[] args){
		// Create scanner object
        Scanner sc = new Scanner(System.in);

        String string = sc.next();
        
		StringIndexOutOfBoundsExceptionExample.generateException(string);
			
		//close scanner stream
		sc.close();
	}
}