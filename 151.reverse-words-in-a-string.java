/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
         
        String[] str = s.split(" ");
        Stack<String> stack = new Stack<>();

        for (String word : str) {
            if (!word.isEmpty()) { 
                stack.push(word);
            }
        }
        
     
        StringBuilder sb = new StringBuilder();
        
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            if (!stack.isEmpty()) { 
                sb.append(" ");
            }
        }
        
        return sb.toString();

       
        
    }
}
// @lc code=end

