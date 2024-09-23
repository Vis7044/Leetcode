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
    ListNode* reverseKGroup(ListNode* head, int k) {
        if(head==NULL) return head;
        int count=0;
        ListNode *check = head;
        while(check && count<k) {
            count++;
            check=check->next;
        }
        if(count<k) return head;
        
        ListNode *prev=NULL;
        ListNode *next=NULL;
        ListNode *cur=head;
        int cnt=0;
        while(cur && cnt<k) {
            next=cur->next;
            cur->next=prev;
            prev=cur;
            cur=next;
            cnt++;
        }
        
        if(next) {
            head->next = reverseKGroup(next,k);
        }
        return prev;
    }
};