/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 1;
        if (nums.length < 2) {
            return;

        }
        while (right < nums.length) {
            if (nums[left] != 0) {
                left++;
                right++;
            } else if (nums[right] == 0) {
                right++;

            } else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }

        }

    }
}
// @lc code=end
