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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode *head = new ListNode(0);
        ListNode *pointer = head;
        int sum=0,carry=0;
        while(l1!=NULL||l2!=NULL||carry!=0){
            int x=0,y=0;
            if(l1!=NULL){
                x = l1->val;
            }
            if(l2!=NULL){
                y=l2->val;
            }
            sum=x+y+carry;
            ListNode *new_node = new ListNode(sum%10);
            carry = sum/10;
            pointer->next = new_node;
            pointer = new_node;
            if(l1!=NULL) l1=l1->next;
            if(l2!=NULL) l2=l2->next;
        }
        pointer = head->next;
        return pointer;
    }
};