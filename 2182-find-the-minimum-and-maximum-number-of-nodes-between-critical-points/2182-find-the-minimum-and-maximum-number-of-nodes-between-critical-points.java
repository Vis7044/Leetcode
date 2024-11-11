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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode pre = head;
        ListNode curr = head.next;
        int result[] = {-1,-1};
        int currentIndex = 1;
        int previousCriticalIndex = 0;
        int firstCriticalIndex = 0;
        int minDistance = Integer.MAX_VALUE;
        while(curr.next!=null) {
            int prevVal = pre.val;
            int currVal = curr.val;
            int nextVal = curr.next.val;
            if((prevVal>currVal && nextVal>currVal) 
            || (prevVal<currVal && nextVal<currVal)) {
                if(previousCriticalIndex==0) {
                    previousCriticalIndex = currentIndex;
                    firstCriticalIndex = currentIndex;
                }else {
                    minDistance = Math.min(
                        minDistance,
                        currentIndex - previousCriticalIndex
                    );
                    previousCriticalIndex=currentIndex;
                }
            }
            currentIndex++;
            pre=curr;
            curr=curr.next;
        }
        if (minDistance != Integer.MAX_VALUE) {
            int maxDistance = previousCriticalIndex - firstCriticalIndex;
            result = new int[] { minDistance, maxDistance };
        }

        return result;
    }
}