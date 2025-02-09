/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = -1;
        while (left < right) {
            int width = right - left;
            int h=Math.min(height[left], height[right]);
            int area=width*h;
            max=Math.max(max, area);
            
            if (height[left] < height[right]) {
                left++;

            } else {
                right--;
            }
        }

        return max;

    }
}
// @lc code=end

