
// Class NullPointerExceptionExample to demonstarte  the null pointer example
public class NullPointerExceptionExample{

    // method to generate exception 
    public static void generateException(String text){
		// use try catch block to handle exception 
        try{
		    text.charAt(0);
		}
		catch(NullPointerException e){
		    System.out.println("Exception has come "+e.getMessage());
		}
		catch(Exception e){
		    System.out.println("Exception has come "+e.getMessage()); 
        }			
    }

    public static void main(String[] args){
		// create scanner object
        Scanner sc = new Scanner(System.in);
        
        String text = null;
        NullPointerExceptionExample.generateException(text);
			
	}
}