/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c =='(') {
                stack.push(')');

            }
            else if (c =='[') {
                stack.push(']');

            }
            else if (c =='{') {
                stack.push('}');

            }
            else if (stack.isEmpty() || stack.pop()!=c) {
                    return false;
                    
                }
            
            
                
            }
            return stack.isEmpty();
        
    }
}
// @lc code=end

