import java.util.Scanner;
// Create a Toggle class to creat a toggled version of a string 

public class Toggle{
    // method to return the toggle case of characters
    public static String toggleString(String string){

	    char [] array = string.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(char ch : array){
		    if(ch >= 65 && ch <= 90){
			    sb.append(toLower(ch));
			}
			else{
			    sb.append(toUpper(ch));
			}
		}
        
		return sb.toString();
        
    }
	
	// Method to convert a character to lowercase using ASCII logic
    public static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        return ch;
    }
	// Method to convert a character to uppercase using ASCII logic
    public static char toUpper(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32);
        }
        return ch;
    }
			    
    public static void main(String[] args) {
	    
		// scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();
		
        System.out.println("The original string: "+ text);
		System.out.println("The toggled string: "+ Toggle.toggleString(text));
        
		// close Scanner stream
        sc.close();
    }
}