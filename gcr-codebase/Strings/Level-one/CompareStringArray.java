import java.util.Scanner;

// Class CompareStringArray to compare string array
public class CompareStringArray{

    // method to create array of character using charAt() method
    public static char[] createArray(String s){
        char [] charArray = new char[s.length()];
        
        for(int i=0; i<s.length(); i++){
            charArray[i] = s.charAt(i);			
        }	
        return charArray;		
    }
	
	// method to create array of character using toCharArray()
    public static char[] createArrayUsingMethod(String s){
        return s.toCharArray();		
    }
	
	// method to compare both the char arrays
    public static boolean compareArray(char[] array1, char []array2 ){
        
        for(int i=0; i<array1.length; i++){
            if(array1[i] != array2[i]){
                return false;
            }				
        }	
        return true;		
    }

    public static void main(String[] args){
		// Create scanner object
        Scanner sc = new Scanner(System.in);

        String string = sc.next();
		char [] strArray1 = CompareStringArray.createArray(string);
		char [] strArray2 = CompareStringArray.createArrayUsingMethod(string);
		
		if(CompareStringArray.compareArray(strArray1, strArray2)){
		    System.out.println("Both are equal");
		}
		else{
		    System.out.println("Both are not equal");
        }
		
			
		//close scanner stream
		sc.close();
	}
}