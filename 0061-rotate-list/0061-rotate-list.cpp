class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if(head == NULL) return head;
        int sz = 0;
        ListNode* temp = head;
        while(temp){
            sz++;
            temp = temp->next;
        }
        k = k%sz;
        
        ListNode* fast = head;
        while(k--){
            fast = fast->next;
        }
        ListNode* slow = head;
        while(fast && fast->next){
            fast = fast->next;
            slow = slow->next;
        }
        fast->next = head;
        ListNode* ret = slow->next;
        slow->next = NULL;
        
        return ret;
    }
};