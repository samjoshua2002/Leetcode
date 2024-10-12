/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
            
        }
        int reverse= x;
        int rem=0;
        while (x!=0) {
            int num= x%10;
            rem= rem*10+num;
            x/=10;
            
        }
        return (reverse==rem);
    }
}
// @lc code=end

