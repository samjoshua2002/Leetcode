/*
 * @lc app=leetcode id=709 lang=java
 *
 * [709] To Lower Case
 */

// @lc code=start
class Solution {

    public String toLowerCase(String s) {

        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] >= 65 && arr[i] <= 90) {
                arr[i] = (char) (arr[i] + 32);
            }

        }
        return new String(arr);

    }
}
// @lc code=end

