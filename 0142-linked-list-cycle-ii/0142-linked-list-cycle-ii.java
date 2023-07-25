/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getFirstNode(ListNode head,ListNode slow){
        ListNode first=head;
        while(slow!=first){
            slow=slow.next;
            first=first.next;
        }
        return first;
    } 
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return getFirstNode(head,slow);
            }
        }
        return null;
    }
}