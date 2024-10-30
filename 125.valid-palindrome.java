/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        String letter= "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
            letter+= s.charAt(i);
        }
        
            
        }
        letter= letter.toLowerCase();
        for (int i = 0; i < letter.length()/2; i++) {
            if (letter.charAt(i)!= letter.charAt(letter.length()-i-1)) {
                return false;
                
            }
            
        }
        return true;
        
    }
}
// @lc code=end

