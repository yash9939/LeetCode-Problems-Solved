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
    public ListNode partition(ListNode head, int x) {
        ListNode newHead = new ListNode();
        ListNode p = newHead;

        ListNode curr = head;
        while(curr!=null){
            if(curr.val<x){
                p.next = new ListNode(curr.val);
                p = p.next;
            }
            curr = curr.next;
        }

        curr = head;
        while(curr!=null){
            if(curr.val>=x){
                p.next = new ListNode(curr.val);
                p = p.next;
            }
            curr = curr.next;
        }

        return newHead.next;        
    }
}