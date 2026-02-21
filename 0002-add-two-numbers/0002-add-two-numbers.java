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
        if(l1.next==null & l1.val==0){
            return l2;
        }
        if(l2.next==null & l2.val==0){
            return l1;
        }
        ListNode ans = new ListNode();
        ListNode c1 = l1, c2 = l2, c3 = ans;
        int carry = 0;
        while(c1!=null || c2!=null){
            if(c1!=null & c2!=null){
                int num = c1.val+c2.val+carry;
                c3.next = new ListNode(num%10);
                carry = num/10;
                c1 = c1.next;
                c2 = c2.next;
            }
            else if(c1==null){
                int num = c2.val+carry;
                c3.next = new ListNode(num%10);
                carry = num/10;
                c2 = c2.next;
            }
            else if(c2==null){
                int num = c1.val+carry;
                c3.next = new ListNode(num%10);
                carry = num/10;
                c1 = c1.next;
            }
            c3 = c3.next;
        }
        if(carry>0){
            c3.next = new ListNode(carry);
        }
        return ans.next;
    }
}