/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        
        Map<Character, Integer> next = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();
        

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            next.put(c, next.getOrDefault(c, 0) + 1);
        }

        int start = 0;
        int end = 0;
        int matched = 0; 

        while (end < s2.length()) {
            char c = s2.charAt(end);

            
            if (next.containsKey(c)) {
                have.put(c, have.getOrDefault(c, 0) + 1);

                
                if (have.get(c).equals(next.get(c))) {
                    matched++;
                }
            }

            
            if (end - start + 1 > s1.length()) {
                char startChar = s2.charAt(start);
                if (next.containsKey(startChar)) {
                    if (have.get(startChar).equals(next.get(startChar))) {
                        matched--;
                    }
                    have.put(startChar, have.get(startChar) - 1);
                }
                start++;
            }

           
            if (matched == next.size()) return true;

            end++;
        }

        return false;
    }
}
// @lc code=end
