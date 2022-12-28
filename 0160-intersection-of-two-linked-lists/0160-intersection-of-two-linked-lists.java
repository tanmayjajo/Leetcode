/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        int l1 = 0;
        while(temp!=null){
            l1++;
            temp = temp.next;
        }
        temp = headB;
        int l2 = 0;
        while(temp!=null){
            l2++;
            temp = temp.next;
        }
        
        
        temp = headA;
        ListNode temp2 = headB;
        
        if(l1>l2){
            while(l1-l2!=0){
                temp=temp.next;
                l1--;
            }
        }else{
            while(l2-l1!=0){
                temp2=temp2.next;
                l2--;
            }
        }
        
        while(temp!=null){
            
            if(temp == temp2){
                return temp;
            }
            
            temp = temp.next;
            temp2 = temp2.next;
        }
        
        return null;
    }
}