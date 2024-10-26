/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int last = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[last] != nums[i]) {
                nums[last + 1] = nums[i];
                last++;

            }

        }
        return last + 1;

    }
}
// @lc code=end
