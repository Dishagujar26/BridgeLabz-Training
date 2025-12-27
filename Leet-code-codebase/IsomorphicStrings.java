//https://leetcode.com/problems/isomorphic-strings/description/
// Problem: 205

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        //  Create mapping arrays
        char[] mapST = new char[256]; // Map from s to t
        char[] mapTS = new char[256]; // Map from t to s

        // Iterate through characters
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check mapping from s to t
            if (mapST[charS] == 0) { // If not mapped yet
                mapST[charS] = charT; // Map charS to charT
            } else {
                if (mapST[charS] != charT) {
                    return false; // Mapped to different character
                }
            }

            // Check mapping from t to s
            if (mapTS[charT] == 0) { // If not mapped yet
                mapTS[charT] = charS; // Map charT to charS
            } else {
                if (mapTS[charT] != charS) {
                    return false; // Mapped to different character
                }
            }
        }

        return true; 
    }
}