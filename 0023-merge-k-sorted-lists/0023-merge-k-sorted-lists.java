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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        if(lists.length==0){
            return head.next;
        }

        TreeMap<Integer, Integer> hm = new TreeMap<>();

        for(int i = 0; i<lists.length; i++){
            ListNode curr = lists[i];
            while(curr!=null){
                hm.put(curr.val, hm.getOrDefault(curr.val, 0)+1);
                curr = curr.next;
            }
        }

        ListNode p = head;
        for(int k: hm.keySet()){
            int freq = hm.get(k);
            while(freq!=0){
                p.next = new ListNode(k);
                freq--;
                p = p.next;
            }
        }

        return head.next;
    }
}