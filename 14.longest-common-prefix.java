/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs== null || strs.length==0) {
            return "";
            
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int index=0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i)==last.charAt(i)) {
                index++;
                
            }
            else{
                break;
            }
            
        }
        return first.substring(0,index);
        
    }
}
// @lc code=end

