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
    public ListNode rotateRight(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        if(size <= 1) return head;
        k = k%size;
        temp = head;
        ListNode temp2 = head;
        
        for(int i = 0; i < size - k-1; i++){
            temp = temp.next;
        }
        if(temp.next == null) return head; // to avoid complete rotation
    
        head = temp.next;
        temp.next = null;
        temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = temp2;
        System.out.println(size);
        return head;
    }
}