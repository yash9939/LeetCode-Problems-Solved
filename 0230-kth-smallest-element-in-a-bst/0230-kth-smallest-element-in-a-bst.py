# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        li = self.inOrder(root, [])
        return li[k-1]

    def inOrder(self, r, l):
        if(r==None):
            return l
        
        self.inOrder(r.left, l)
        l.append(r.val)
        self.inOrder(r.right, l)
        return l