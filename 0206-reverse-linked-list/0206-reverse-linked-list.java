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
        if(head == null) return head; //handling corner case
        ListNode prev = null;
        ListNode curr = head;
        ListNode Next = head.next;
        
        while(Next!=null){
            curr.next = prev; // linking to prev node
            
						//shifting pointers
            prev = curr;
            curr = Next;
            Next = Next.next;
        }
        curr.next = prev; //Last node of list, becoming first node of reversed Linked List

        return curr;
    }
}