/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        // String[] arr =s.split(" ");
        // String ans="";
        // for (int i = arr.length-1; i>=0; i--) {
        //     ans+= arr[i];
        //     if (i!=0) {
        //         ans+=" ";
                
        //     }


            
        // }
        // return ans;
        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) {
                res.append(" ");
            }
        }

        return res.toString().trim();
        
    }
}
// @lc code=end

