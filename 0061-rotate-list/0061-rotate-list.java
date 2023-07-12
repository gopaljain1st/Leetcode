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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode start = head, temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        if(k==0 || head==null || size==1){
            return head;
        }
        if(k>size){
            k = k%size;
        }
        if(k==size || k==0){
            return head;
        }
        temp = head;
        for(int i=0;i<size-k-1;i++){
            temp=temp.next;
        }
        start = temp.next;
        temp.next = null;
        temp = start;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        return start;
    }
}