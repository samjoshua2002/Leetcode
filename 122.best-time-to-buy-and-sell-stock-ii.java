/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int count=0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i]< prices[i+1]) {
                count+=prices[i+1]-prices[i];
                
            }
            
        }
        return count;
        
    }
}
// @lc code=end

