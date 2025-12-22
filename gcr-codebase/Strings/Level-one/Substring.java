import java.util.Scanner;

// Class Substring to create substring of a string then compare
public class Substring{

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
	
	// method to generate the string 
    public static String createSubstring(String s1, int startIdx, int endIdx){
        String substring = s1.substring(startIdx,endIdx);
        return substring;		
    }

    public static void main(String[] args){
		// Create scanner object
        Scanner sc = new Scanner(System.in);

        
        String string = sc.next();
		int startIdx = sc.nextInt();
		int endIdx = sc.nextInt();
        
		String substring = Substring.createSubstring(string,startIdx,endIdx);
        if(compareTwoStrings.compareString(string,substring)){
		    System.out.println("Equal");
	    }
		else{
		    System.out.println("Not Equal");
		}
			
		//close scanner stream
		sc.close();
	}
}