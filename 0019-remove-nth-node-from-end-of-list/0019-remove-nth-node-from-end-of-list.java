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
        ListNode a = head;
        while(n-->0){
            a = a.next;
        }
        if(a==null) return head.next;
        ListNode b = head;
        while(true){
            a=a.next;
            if(a==null) break;
            b=b.next;
        }
        if(b.next==null)return null;
        b.next = b.next.next;
        return head;
    }
}