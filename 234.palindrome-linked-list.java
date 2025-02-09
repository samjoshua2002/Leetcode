/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while ( fast!= null && fast.next!=null ) {
            slow= slow.next;
            fast= fast.next.next;


            
        }
        ListNode previous = null;
        while (slow!=null) {
            ListNode next =slow.next;
            slow.next=previous;
            previous=slow;
            slow=next;
            
        }
        ListNode current= head;
        while (previous!=null && current!=null ) {
            if (previous.val !=current.val) {
                return false;
                
            }
            previous=previous.next;
            current=current.next;
            
        }
        return true;
        
    }
}
// @lc code=end

