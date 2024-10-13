/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> ans = new HashSet<>();
        
        if (nums == null || nums.length <3) {
            return new ArrayList<>();
            
        }
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length-2; i++) {
            int first = i+1;
            int last = nums.length-1;
            while (first<last) {
                int sum = nums[i]+ nums[first]+nums[last];
                if (sum==0) {
                    ans.add(Arrays.asList(nums[i], nums[first], nums[last]));
                    first++;
                    last--;
                }
                else if(sum<0){
                    first++;
                }
                else last--;


                
            }
            
        }
        for (List<Integer> list : ans) {
            result.add(list);
            
        }
        return result;
        
    }
}
// @lc code=end

