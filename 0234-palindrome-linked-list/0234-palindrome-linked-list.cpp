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
    ListNode* reverse(ListNode* head) {
        ListNode* p=NULL;
        ListNode *q=head;
        ListNode *r=NULL;
        while(q!=NULL) {
            r=q->next;
            q->next = p;
            p=q;
            q=r;
        }
        return p;
    }
public:
    bool isPalindrome(ListNode* head) {
        if(head == NULL || head->next == NULL){
            return (head);
        }
        ListNode *fast=head,*slow = head;
        while(fast!=NULL && fast->next!=NULL) {
            slow=slow->next;
            fast = fast->next->next;
        }
        slow = reverse(slow);
        fast=head;
        while(slow!=NULL) {
            
            if(slow->val!=fast->val) return false;
            slow=slow->next;
            fast=fast->next;
        }
        return true;
    }
};