/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] arr , int start, int end){
        while (start<end) {
            int temp =arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }

    }
    public void rotate(int[] nums, int k) {
        k= k % nums.length;
        rotate(nums,0,nums.length-1);
        rotate(nums,0,k-1);
        rotate(nums,k,nums.length-1);
        
    }
}
// @lc code=end

