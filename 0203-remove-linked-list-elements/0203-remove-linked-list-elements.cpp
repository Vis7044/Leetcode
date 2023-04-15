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
    ListNode* removeElements(ListNode* head, int val) {
         if(head==NULL)return head;
        ListNode* p = head;
        while(p->next!=NULL){
            if(head->val==val){
                head=head->next;
                p=head;
            }else if(p->next->val==val && p->next->next==NULL){
                p->next=NULL;
            }else if(p->next->val==val){
                p->next=p->next->next;
            }else{
                p=p->next;
            }
             
        }
        if(head->val==val) return head->next;
        
        return head;
    }
};