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
        int L1 = len(headA);
        int L2 = len(headB);
        
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        
        if(L1>L2){
            for(int i = 0; i < L1-L2; i++){
                temp1=temp1.next;
            }
                
        }else{
            for(int i = 0; i < L2-L1; i++){
                temp2=temp2.next;
            }
        }
        
        while(temp1!=null || temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return null;
    }
    public int len(ListNode head){
        ListNode hehe = head;
        int ans = 0;
        while(hehe!=null){
            hehe=hehe.next;
            ans++;
        }
        return ans;
    }
}