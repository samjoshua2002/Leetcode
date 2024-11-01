/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
  public int myAtoi(String s) {
      // Trim whitespace from the input string
      s = s.trim();
      if (s.length() == 0) return 0;

      int sign = 1;
      long ans = 0;
      int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;

      // Check the first character for a sign
      int i = 0;
      if (s.charAt(0) == '-') {
          sign = -1;
          i++;
      } else if (s.charAt(0) == '+') {
          i++;
      }

      // Parse digits and build the number
      while (i < s.length() && Character.isDigit(s.charAt(i))) {
          ans = ans * 10 + (s.charAt(i) - '0');
          if (sign == -1 && -ans < MIN) return MIN;
          if (sign == 1 && ans > MAX) return MAX;
          i++;
      }

      return (int)(sign * ans);
  }
}

// @lc code=end

