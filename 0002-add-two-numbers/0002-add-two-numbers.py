# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        if l1.next==None and l1.val==0:
            return l2
        if l2.next==None and l2.val==0:
            return l1
        c1, c2 = l1, l2
        carry = 0
        ans = ListNode()
        c3 = ans
        while(c1!=None or c2!=None):
            if(c1!=None and c2!=None):
                num = c1.val+c2.val+carry
                c3.next = ListNode(num%10)
                carry = num//10
                c1 = c1.next
                c2 = c2.next
            elif(c1==None):
                num = c2.val+carry
                c3.next = ListNode(num%10)
                carry = num//10
                c2 = c2.next
            elif(c2==None):
                num = c1.val+carry
                c3.next = ListNode(num%10)
                carry = num//10
                c1 = c1.next
            c3 = c3.next
        if(carry>0):
            c3.next = ListNode(carry)
            c3 = c3.next
        return ans.next
