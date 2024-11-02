/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int ans =0;
        Set<Character> seen = new HashSet<>();
        while (end< s.length()) {
            if (!seen.contains(s.charAt(end))) {
               
                seen.add(s.charAt(end));
                ans = Math.max(ans, end - start + 1); 
                end++; 
            } else {
                
                seen.remove(s.charAt(start));
                start++;
            }
        }

        return ans;
        
    }
}
// @lc code=end

