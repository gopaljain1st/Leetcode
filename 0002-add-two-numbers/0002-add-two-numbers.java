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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode ans = new ListNode();
        ListNode finalNode = ans;
        while(l1!=null && l2!=null) {
            int sum = l1.val + l2.val + carry;
            ListNode node = new ListNode();
            node.val = sum%10;
            ans.next = node;
            ans = ans.next;
            carry = sum/10;
            l1=l1.next;
            l2=l2.next;
        }
        while (l1!=null){
            int sum = l1.val + carry;
            ListNode node = new ListNode();
            node.val = sum%10;
            ans.next = node;
            ans = ans.next;
            carry = sum/10;
            l1=l1.next;
        }
        while (l2!=null) {
            int sum = l2.val + carry;
            ListNode node = new ListNode();
            node.val = sum%10;
            ans.next = node;
            ans = ans.next;
            carry = sum/10;
            l2=l2.next;
        }
        if (carry>0){
            ListNode node = new ListNode();
            node.val = carry;
            ans.next = node;
        }
        return finalNode.next;
    }
    
    
}