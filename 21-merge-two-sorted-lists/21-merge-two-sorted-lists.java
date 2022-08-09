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
    public ListNode mergeTwoLists(ListNode temp1, ListNode temp2) {
        
        if (temp1 == null && temp2 == null) {
            return null;
        }
        if (temp1 == null) {
            return temp2;
        }
        if (temp2 == null) {
            return temp1;
        }
        
        ListNode ans = new ListNode(0);
        
        ListNode temp3 = ans;
        
        while(temp1!=null && temp2!=null){
            if(temp1.val>temp2.val){
                temp3.next = temp2;
                temp2 = temp2.next;
            }else{
                temp3.next = temp1;
                temp1 = temp1.next;
            }
            temp3 = temp3.next;
        }
        
        if(temp2!=null){
            temp3.next = temp2;
        }else if(temp1!=null){
            temp3.next = temp1;
        }
        
        return ans.next;
    }
}