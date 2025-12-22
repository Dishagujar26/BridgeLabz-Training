import java.util.Scanner;

// Class CaseConversion to convert string case to upper case
public class CaseConversion{

    // method to manually convert the case
    public static String convertToUpperCase(String name){
        
		StringBuilder sb = new StringBuilder();
		for(char e : name.toCharArray()){
		    if(Character.isLowerCase(e)){
			    sb.append(Character.toUpperCase(e));
			}
			else{
				sb.append(e);
			}
		}
		return sb.toString();
		
    }
	
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
        
		String string = sc.next();
		String string1 = CaseConversion.convertToUpperCase(string);
		String string2 = string1.toUpperCase();
		
		if(string1.equals(string2)){
		    System.out.println("Equal");
	    }
		else{
		    System.out.println("Not Equal");
		}
	    
		
		//close scanner stream
		sc.close();
	}
}