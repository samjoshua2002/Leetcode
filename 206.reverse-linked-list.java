/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode next;
        ListNode previous = null;
        while (curr!=null) {
            next = curr.next;
            curr.next= previous;
            previous= curr;
            if (next == null) break;
            curr= next;
            
        }
        return curr;
        
    }
}
// @lc code=end

