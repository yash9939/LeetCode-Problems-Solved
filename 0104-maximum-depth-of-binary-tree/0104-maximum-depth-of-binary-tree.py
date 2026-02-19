# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if(root==None):
            return 0
        if(root.left==None and root.right==None):
            return 1
        
        return max(self.calculateHeight(root.left, 1), self.calculateHeight(root.right, 1))
    
    def calculateHeight(self, r, cnt):
            if(r==None):
                return cnt
            
            return max(self.calculateHeight(r.left, cnt+1), self.calculateHeight(r.right, cnt+1))