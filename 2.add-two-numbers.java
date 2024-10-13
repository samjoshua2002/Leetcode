/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.*;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode pointer = null;
        int carry =0;
        
        
        while (l1 != null || l2!= null|| carry >0) {
            int sum =carry;
            if (l1!=null) {
                 sum += l1.val;
                l1= l1.next;
                
            }
            if (l2!=null) {
                 sum=sum+l2.val;
                l2= l2.next;
                
            }
            carry= sum/10;
            sum= sum%10;
            ListNode newnNode = new ListNode(sum);
            if (result == null) {
                result = newnNode;
                pointer = result;
            } else {
                pointer.next = newnNode;
                pointer = pointer.next;
            }

            

            
        }
        return result;

        
    }
}
// @lc code=end

