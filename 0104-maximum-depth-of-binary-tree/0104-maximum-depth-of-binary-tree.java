/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return Math.max(calculateHeight(root.left, 1), calculateHeight(root.right, 1));
    }
    
    public int calculateHeight(TreeNode r, int cnt){
        if(r==null){
            return cnt;
        }
        return Math.max(calculateHeight(r.left, cnt+1), calculateHeight(r.right, cnt+1));
    }
}