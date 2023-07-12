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
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null || head.next.next ==null){
            return false;
        }
        ListNode firstPointer = head;
        ListNode secondPointer = head.next.next;
        
        while(firstPointer!=null && secondPointer!=null){
            if(firstPointer == secondPointer){
                return true;
            }
            firstPointer = firstPointer.next;
            if(secondPointer.next==null || secondPointer.next.next==null){
                return false;
            }
            secondPointer = secondPointer.next.next;
        }
        return false;
    }
}