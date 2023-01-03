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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        int value = 0;
        if(list1.val < list2.val){
            value = list1.val;
            list1 = list1.next;
        }else{
            value = list2.val;
            list2 = list2.next;
        }
        
        ListNode ans = new ListNode(value);
        ans.next = mergeTwoLists(list1, list2);
        return ans;
    }
}