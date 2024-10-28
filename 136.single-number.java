/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int exor =0;
        for (int i = 0; i < nums.length; i++) {
            exor ^= nums[i];
            
        }
        return exor;
        
    }
}
// @lc code=end

