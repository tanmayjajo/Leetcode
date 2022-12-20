/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode temp = node;
        
        //swapping
        temp.val = temp.next.val;
        
        node.next = node.next.next;   
    }
}