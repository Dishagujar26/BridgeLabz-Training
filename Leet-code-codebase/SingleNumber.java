//https://leetcode.com/problems/single-number/
//Problem: 136

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int elem : nums){
            result ^= elem;
        }
        return result;
        
    }
}