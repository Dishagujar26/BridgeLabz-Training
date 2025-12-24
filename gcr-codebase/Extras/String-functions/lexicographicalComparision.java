import java.util.Scanner;
// Create a lexicographicalComparision class to compare two strings lexicographically 

public class lexicographicalComparision{

    // method to check the strigs lexicographically(dictionary order)
    public static void compareLexicographical(String string1, String string2){

	    char [] array1 = string1.toCharArray();
		char [] array2 = string2.toCharArray();
		
		int idx = 0;
		boolean isEqual = true;
		
		while(idx <= array1.length && idx <= array2.length){
		    if(array1[idx] == array2[idx]){
			    idx++;
				continue;
		    }
			else if(array1[idx] < array2[idx]){
			    System.out.println(string1 + " comes before "+ string2 +" in lexicographical order");
				return;
			}
			else{
			    System.out.println(string2+ " comes before "+ string1 +" in lexicographical order");
				return;
            }
			
		}
		
		// till here all characters are matched
		if(array1.length == array2.length){
		    System.out.println("The strings are equal");
		}
		
		else if (array1.length < array2.length) {
            System.out.println(string1 + " comes before " + string2 + " in lexicographical order");
        }
        
		else {
            System.out.println(string2 + " comes before " + string1 + " in lexicographical order");
        }
        
    }
			    
    public static void main(String[] args) {
	    
		// scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String string1 = sc.nextLine();
		String string2 = sc.nextLine();
		
		lexicographicalComparision.compareLexicographical(string1,string2);
        
		// close Scanner stream
        sc.close();
    }
}