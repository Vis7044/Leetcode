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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode first = list1;
        ListNode second = list2;
        ListNode third =head;
        
        while(first!=null && second!=null){
            if(first.val>second.val){
                head.next=second;
                second=second.next;
            }else{
                head.next=first;
                first=first.next;
            }
            head=head.next;
        }
        if(first==null){
            head.next=second;
        }else{
            head.next=first;
        }
        return third.next;
    }
}