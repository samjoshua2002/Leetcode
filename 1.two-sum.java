/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int c = target- nums[i];
            if (map.containsKey(c)) {
                return new int[]{map.get(c),i};

                
            }
            map.put(nums[i], i);
            
        }
        return null;
    }
}




