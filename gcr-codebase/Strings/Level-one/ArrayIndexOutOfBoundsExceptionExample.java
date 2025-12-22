import java.util.Scanner;

// Class ArrayIndexOutOfBoundsExceptionExample to demonstrate Array Index Out Of Bounds Exception
public class ArrayIndexOutOfBoundsExceptionExample{

    // method to handle exception
    public static void handleException(String[] name){
        
		// use try catch block to handle exception 
		try{
		    for(int i=0; i<=name.length; i++){
			    System.out.println(name[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
		    System.out.println("The exception has occured "+ e.toString());
		}
		catch(IndexOutOfBoundsException e){
		    System.out.println("The exception has occured "+ e.toString());
		}
		
    }

    public static void main(String[] args){
		// Create scanner object
        Scanner sc = new Scanner(System.in);

        String []name = new String[5];
        
		// Take input for name array
	    for(int i=0; i<name.length; i++){
		    name[i] = sc.next();
		}
		ArrayIndexOutOfBoundsExceptionExample.handleException(name);
		
		//close scanner stream
		sc.close();
	}
}