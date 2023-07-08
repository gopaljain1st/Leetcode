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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftNode = null,root = head;
        Stack<Integer> data = new Stack<>();
        for(int i=1;i<=right;i++){
            if(i==left){
                leftNode = root;
            }
            if(leftNode!=null){
                data.push(root.val);
            }
            root = root.next;
        }
        for (int i=1;i<=right-left+1;i++){
            leftNode.val = data.pop();
            leftNode = leftNode.next;
        }
        return head;
    }
}