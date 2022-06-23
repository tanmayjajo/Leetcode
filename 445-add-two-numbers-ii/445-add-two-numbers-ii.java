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
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        
        while(temp1!=null){
            st1.push(temp1.val);
            temp1 = temp1.next;
        }
        while(temp2!=null){
            st2.push(temp2.val);
            temp2 = temp2.next;
        }
        
        ListNode ans = new ListNode(0);
        ListNode temp3 = ans;
        int carry = 0;
        while(!st1.empty() || !st2.empty() || carry!= 0){
            int huehue = ((st1.empty())? 0 : st1.pop()) + ((st2.empty())? 0 : st2.pop());
            temp3.next = new ListNode(( huehue+ carry)%10);
            carry = (huehue + carry)/10;
            temp3 = temp3.next;
        }
        Stack<Integer> st3 = new Stack<>();
        while(ans.next != null){
            st3.push(ans.next.val);
            ans = ans.next;
        }
        
        ans.val = st3.pop();
        ListNode temp4 = ans;
        while(!st3.empty()){
            temp4.next = new ListNode(st3.pop());
            temp4 = temp4.next;
        }

        return ans;
    }
}