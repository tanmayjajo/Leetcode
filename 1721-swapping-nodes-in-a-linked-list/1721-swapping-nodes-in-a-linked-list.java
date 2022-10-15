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
    public ListNode swapNodes(ListNode head, int k) {
        
        
        // in this solution I have changed the values inside the nodes
        
        ListNode temp1 = head;
        ListNode temp2 = head;  
        ListNode save = head;
        
        while(k-->1){
            temp1 = temp1.next;
        }
        save = temp1;
        while(temp1.next!=null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        int c = temp2.val;
        temp2.val = save.val;
        save.val = c;
        return head;
    }
}