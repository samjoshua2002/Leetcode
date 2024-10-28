/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       


        Map<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> array = new HashSet<>();
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
        int index = 0;
        for (int num : array) {
            result[index++] = num;
        }
        return result;
        

        
    }
}


// @lc code=end
