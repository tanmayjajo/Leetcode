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
    ListNode* reverse(ListNode* head){
        if(!head || !head->next) return head;
        
        ListNode* temp = NULL;
        ListNode* temp1 = head;
        ListNode* temp2 = head;
        
        while(temp1 && temp2){
            temp2 = temp1->next;
            temp1->next = temp;
            
            temp = temp1;
            temp1 = temp2;
        }
        
        return temp;
    }
    
    void reorderList(ListNode* head) {
        if(head == NULL || head->next == NULL) return;
        
        ListNode* slow = head;
        ListNode* fast = head;
        
        while(fast && fast->next && fast->next->next){
            fast = fast->next->next;
            slow = slow->next;
        }
        
        ListNode* l2 = reverse(slow->next);
        slow->next = NULL;
        
        ListNode* l1 = head;
        
        ListNode* l3 = l1;
        ListNode* l4 = l2;
        
        while(l1 && l2){
            l3 = l3->next;
            l4 = l4->next;
            
            l1->next = l2;
            l2->next = l3;
            
            l1 = l3;
            l2 = l4;
        }
    }
};