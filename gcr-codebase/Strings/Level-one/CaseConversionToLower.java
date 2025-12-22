import java.util.Scanner;

// Class CaseConversionToLower to convert string case to lower case
public class CaseConversionToLower{

    // method to manually convert the case
    public static String convertToLowerCase(String name){
        
		StringBuilder sb = new StringBuilder();
		for(char e : name.toCharArray()){
		    if(Character.isUpperCase(e)){
			    sb.append(Character.toLowerCase(e));
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
		String string1 = CaseConversionToLower.convertToLowerCase(string);
		String string2 = string1.toLowerCase();
		
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