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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        
        Stack<Integer> st = new Stack<>();
        
        int a = 0;
        while(temp1!=null){
            
            st.add(temp1.val);
            temp1 = temp1.next;
            a++;
            if(a == k){
                while(a-->0){
                    temp2.val = st.pop();
                    temp2 = temp2.next;
                }
                a = 0;
            }
            
        }
        return head;
    }
}