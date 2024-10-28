/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int pointer = digits.length-1;
        while (digits[pointer]==9) {
            if(pointer==0){
                int[] arr = new int[digits.length+1];
                arr[0]=1;
                return arr;
            }
            digits[pointer]=0;
            pointer--;
            
        }

        digits[pointer]++;
        return digits;
        
    }
}
// @lc code=end

