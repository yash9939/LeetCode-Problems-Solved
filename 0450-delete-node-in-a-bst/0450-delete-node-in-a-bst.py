# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
        if(root==None):
            return None
        
        if(root.val<key):
            root.right = self.deleteNode(root.right, key)
        elif(root.val>key):
            root.left = self.deleteNode(root.left, key)
        else:
            if(root.right==None):
                return root.left
            elif(root.left==None):
                return root.right
            else:
                root.val = self.minValue(root.right)
                root.right = self.deleteNode(root.right, root.val)

        return root

    def minValue(self, r):
        while(r.left!=None):
            r = r.left 
        return r.val