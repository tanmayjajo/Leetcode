/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *front = head;
        while(n--){
            front = front->next;
        }
        ListNode *back = head;
        
        while(front && front->next){
            back = back->next;
            front = front->next;
        }
        if(front) back->next = back->next->next;
        else return head->next;
        return head;
    }
};