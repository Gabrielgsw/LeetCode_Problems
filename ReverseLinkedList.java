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
//Link: https://leetcode.com/problems/reverse-linked-list/description/?envType=problem-list-v2&envId=recursion
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode result;
   
        if(head == null || head.next == null ){
            return head;
        }

        result = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return result;
    }
}
