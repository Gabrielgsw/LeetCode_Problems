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

// Link: https://leetcode.com/problems/palindrome-linked-list/?envType=problem-list-v2&envId=recursion

class PalindromeLinkedList {
    Stack<Integer> s = new Stack<>();

    public boolean isPalindrome(ListNode head) {
        ListNode aux = head;

        if(head == null || head.next == null){
            return true;
        }

            while(head != null){
                s.push(head.val);
                head=head.next;
            }
                   
            while(!s.isEmpty()){
                if(aux.val != s.pop()){
                    return false;
                }
                aux=aux.next;
            }

            return true;      
}

}
