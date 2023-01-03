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
        
        return add(l1, l2, 0);
    }
    
    public ListNode add(ListNode l1, ListNode l2, int carry){
        if(carry == 0 && l1==null && l2== null){
            return null;
        }
        if(l1==null){
            l1=new ListNode(0);
        }
        if(l2==null){
            l2=new ListNode(0);
        }
        
        ListNode ans;
        int value = l1.val+l2.val + carry;
        ans = new ListNode(value%10);
        int carr = value/10;
    
        ans.next = add(l1.next, l2.next, carr);
        
        return ans;
    }
}