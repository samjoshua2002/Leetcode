/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int left= 0;
        int right = s.length-1;
        while (left<right) {
            char temp= s[right];
            s[right]= s[left];
            s[left]=temp;
            left++;
            right--;
            
        }
        
    }
}
// @lc code=end

