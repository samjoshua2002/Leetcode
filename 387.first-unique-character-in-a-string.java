/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        char[] str = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char c : str) {
            if (!map.containsKey(c)) map.put(c,0);
            map.put(c,map.get(c)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(str[i]) == 1) {
                return i;  
            }
            
            
        }
        return -1;
        
    }
}
// @lc code=end

