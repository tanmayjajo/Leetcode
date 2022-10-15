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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            swap(temp);
            temp = temp.next.next;
        }
        return head;
    }
    public void swap(ListNode root){
        if(root.next==null)return;
        int c = root.val;
        root.val = root.next.val;
        root.next.val = c;
    }
}