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
    public void reorderList(ListNode head) {
        int size = sizeOfLL(head);
        ListNode[] arr = new ListNode[size];
        
        ListNode temp = head;
        int k = 0;
        while(temp!=null){
            arr[k] = temp;
            temp = temp.next;
            k++;
        }
        
        int i = 0;
        int j = size-1;
        
        while(i<j){
            arr[i].next=arr[j];
            arr[j].next=arr[i+1];
            i++;
            j--;
        }
        arr[i].next=null;
        head = arr[0];
    }
    
    public int sizeOfLL(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    
}