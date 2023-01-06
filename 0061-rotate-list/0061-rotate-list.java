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
        if(size < 2) return head;
        k = k%size;
        if(k == 0) return head;
        
        
        
        head = rotate(head);
        temp = head;
        while(k-->1){
            temp = temp.next;
        }
        ListNode temp2 = temp.next;
        temp.next = null;
        head = rotate(head);
        temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = rotate(temp2);
        
        return head;
    }
    public ListNode rotate(ListNode head){
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            temp.val = list.remove(list.size() - 1);
            temp = temp.next;
        }
        
        return head;
    }
}