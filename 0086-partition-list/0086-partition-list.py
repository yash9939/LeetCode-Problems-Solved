# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        if(head==None or head.next==None):
            return head
        
        newHead = ListNode()
        p = newHead

        curr = head
        while(curr!=None):
            if(curr.val<x):
                p.next = ListNode(curr.val)
                p = p.next
            curr = curr.next
        
        curr = head
        while(curr!=None):
            if(curr.val>=x):
                p.next = ListNode(curr.val)
                p = p.next
            curr = curr.next
        
        return newHead.next