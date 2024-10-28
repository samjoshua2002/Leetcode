/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])) map.put(nums1[i],0);
            map.put(nums1[i],map.get(nums1[i])+1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                array.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
                if (map.get(nums2[i])==0) {
                    map.remove(nums2[i]);
                    
                }
                
            }
            
        }
        int[] result = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            result[i] = array.get(i);
        }
        return result;
        

        
    }
}
// @lc code=end

