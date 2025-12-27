//https://leetcode.com/problems/reverse-string/description/
//Problem: 344

public class ReverseString {

    public void swap(char[] s, int idx1 , int idx2){
        char temp = s[idx1];
        s[idx1] = s[idx2];
        s[idx2] = temp;
    }
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        while(start < end){
            swap(s,start,end);
            start ++;
            end -- ;
        }
    }
}