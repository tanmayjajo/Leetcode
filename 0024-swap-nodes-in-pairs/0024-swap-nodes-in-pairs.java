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
    public ListNode swapPairs(ListNode head){
        // this recursive solution is not changing values inside the nodes, it is changing the connections between nodes
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode aage = head.next;
        aage.next = swapPairs(head.next.next);
        head.next = aage.next;
        aage.next = head;
        return aage;
    }
}