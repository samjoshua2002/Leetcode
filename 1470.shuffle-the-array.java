/*
 * @lc app=leetcode id=1470 lang=java
 *
 * [1470] Shuffle the Array
 */

// @lc code=start
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n*2];
        for (int i = 0; i < n; i++) {
            arr[i*2]=nums[i];
            arr[i*2+1]=nums[i+n];
            
        }

        return arr;

        
    }
}
// @lc code=end

