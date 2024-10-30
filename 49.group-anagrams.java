/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map = new HashMap<>();
        for (String string : strs) {
            char[] unsorted = string.toCharArray();
            Arrays.sort(unsorted);
            String sorted = new String(unsorted);
            if (!map.containsKey(sorted)) map.put(sorted,new ArrayList<>());
            map.get(sorted).add(string);
            
        }
        return new ArrayList<>(map.values());
        
    }
}
// @lc code=end

