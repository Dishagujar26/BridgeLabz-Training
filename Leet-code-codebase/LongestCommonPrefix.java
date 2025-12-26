import java.util.Scanner;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // If the array is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Take the first string as the initial common prefix
        String prefix = strs[0];

        // Compare the prefix with each subsequent string in the array
        for (int i = 1; i < strs.length; i++) {
            // While the current string does not start with the prefix,
            // reduce the prefix by removing the last character
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If the prefix becomes empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
	
	public static void main(String []args){
        
		// create Scanner object
        Scanner sc=new Scanner (System.in);
        
        int a=sc.nextInt();
        String []strs = new String[a];
       
        for(int i=0;i<strs.length;i++){
            strs[i]=sc.next();
        }
        
        System.out.println("Longest common prefix "+LongestCommonPrefix.longestCommonPrefix(strs));
		
		// close Scanner stream
		sc.close();

    }
}