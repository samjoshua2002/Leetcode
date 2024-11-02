/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode slow = newhead;
        ListNode fast = newhead;
        for (int i = 0; i < n; i++) {
            fast= fast.next;
            
        }
        while (fast.next != null) {
            fast= fast.next;
            slow = slow.next;
            
        }
        slow.next =slow.next.next;
        return newhead.next;
        
    }
}
// @lc code=end

