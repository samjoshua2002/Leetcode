/*
 * @lc app=leetcode id=1813 lang=java
 *
 * [1813] Sentence Similarity III
 */

// @lc code=start
class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] a = sentence1.split(" ");
        String[] b = sentence2.split(" ");
        
        // Ensure `a` is always the longer sentence or same length
        if (a.length < b.length) {
            String[] temp = a;
            a = b;
            b = temp;
        }
        
        int start = 0;
        int end = 0;
        
        // Check prefix match
        while (start < b.length && a[start].equals(b[start])) {
            start++;
        }
        
        // Check suffix match
        while (end < b.length && a[a.length - end - 1].equals(b[b.length - end - 1])) {
            end++;
        }
        
        // Both prefix and suffix parts should fully cover `b`
        return start + end >= b.length;
    }
}

// @lc code=end

