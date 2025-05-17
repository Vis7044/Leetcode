/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p=null,q=null,r=null;
        r=head;
        q=head;
        while(q!=null) {
            r=r.next;
            q.next=p;
            p=q;
            q=r;
        }
        return p;
    }
}