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
    void reorderList(ListNode* head) {
        ListNode* temp = head;
        int sz = 0;
        while(temp){
            temp = temp->next;
            sz++;
        }
        
        temp = head;
        int arr[sz];
        for(int i = 0; i < sz; i++){
            arr[i] = temp->val;
            temp = temp->next;
        }
        int s = 0, e = sz-1;
        
        temp = head;
        for(int i = 0; i < sz; i++){
            if(i%2==0){
                temp->val = arr[s++];
            }else{
                temp->val = arr[e--];
            }
            temp = temp->next;
        }
    }
};