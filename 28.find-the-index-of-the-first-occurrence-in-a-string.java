/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle); build in function

        int m =haystack.length();
        int n = needle.length();
        if (n==0) return 0;
        for (int i = 0; i <= m-n; i++) {
            if (haystack.substring(i,i+n).equals(needle)) {
                return i;
                
            }

            
        }
        return -1;
        
    }
}
// @lc code=end

