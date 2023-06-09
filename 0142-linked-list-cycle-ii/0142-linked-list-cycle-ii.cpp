/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        unordered_set<ListNode*> st;
        ListNode *temp = head;
        while(temp){
            if(st.count(temp)){
                return temp;
            }else{
                st.insert(temp);
            }
            temp = temp->next;
        }
        return NULL;
    }
};