import java.util.Scanner;

// Class CompareTwoStrings to compare two strings
public class CompareTwoStrings{

    // method to compare two strings 
    public static boolean compareString(String s1, String s2){
        boolean isEqual = false;
        
		if(s1.length() != s2.length()) return false;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }			
        }	
        return true;		
    }

    public static void main(String[] args){
		// Create scanner object
        Scanner sc = new Scanner(System.in);

        
        String stringOne = sc.next();
		String stringTwo = sc.next();

        if(CompareTwoStrings.compareString(stringOne,stringTwo)){
		    System.out.println("Equal");
	    }
		else{
		    System.out.println("Not Equal");
		}
			
		//close scanner stream
		sc.close();
	}
}