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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        int carry = 0;
        ListNode ans = new ListNode(0);
        ListNode temp1 = ans; 
    
        while(true){
            if(carry == 0 && l1==null && l2 == null){
                break;
            }
            if(l1==null){
                l1 = new ListNode(0);
            }
            if(l2==null){
                l2 = new ListNode(0);
            }
            int value = l1.val + l2.val + carry; 

            temp1.next = new ListNode(value%10);
            temp1 = temp1.next;
            
            carry = value/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        return ans.next;
    }
}