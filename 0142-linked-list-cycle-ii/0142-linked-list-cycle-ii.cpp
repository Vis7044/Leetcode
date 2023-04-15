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
         ListNode *s=head,*f=head;
        while(f&&f->next){
            f=f->next->next;
            s=s->next;
            if(f==s){
                s=head;
                while(s!=f){
                    f=f->next;
                    s=s->next;
                }
                return s;
            }
        }
        
        return nullptr;
    }
};