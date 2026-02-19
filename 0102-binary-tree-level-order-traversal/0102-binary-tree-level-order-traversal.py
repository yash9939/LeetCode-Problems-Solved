# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        ans = []
        if(root==None):
            return ans
        
        q = []
        q.append(root)
        while(not(len(q)==0)):
            res = []
            size = len(q)
            for i in range(0, size):
                res.append(q[0].val)
                if(q[0].left!=None):
                    q.append(q[0].left)
                if(q[0].right!=None):
                    q.append(q[0].right)
                q.pop(0)
            ans.append(res)
        
        return ans