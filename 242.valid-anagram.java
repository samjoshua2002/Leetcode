/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] unsorted1 = s.toCharArray();
        Arrays.sort(unsorted1);
        String sorted1 = new String(unsorted1);
        char[] unsorted2 = t.toCharArray();
        Arrays.sort(unsorted2);
        String sorted2 = new String(unsorted2);
        if (sorted1.equals(sorted2)) {
            return true;
            
        }
        return false;
        
        
    }
}
// @lc code=end

