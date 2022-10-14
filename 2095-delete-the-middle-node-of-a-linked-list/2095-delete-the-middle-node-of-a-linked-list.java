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
    public ListNode deleteMiddle(ListNode head) {
        int size = 0;
        ListNode temp = head;
        
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        if(size == 1){
            return null;
        }
        temp = head;
        int i = size/2;
        while(i-->1){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}