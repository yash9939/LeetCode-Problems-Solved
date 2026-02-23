# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        if(root.left == None and root.right == None):
            return True

        order = self.inOrder(root, [])

        for i in range(len(order)-1):
            if(order[i] >= order[i+1]):
                return False
        
        return True
    
    def inOrder(self, r, l):
        if(r==None):
            return l
        
        self.inOrder(r.left, l)
        l.append(r.val)
        self.inOrder(r.right, l)
        return l