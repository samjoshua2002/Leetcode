/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int c = target -nums[i];
            if (m.containsKey(c)) {
                return new int[] {m.get(c),i};
                
            }
            m.put(nums[i],i);
            

            
        }
        return null;
        
    }
}




