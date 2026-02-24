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
    public boolean isValidBST(TreeNode root) {
        return validBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean validBST(TreeNode r, long low, long hi){
        if(r==null){
            return true;
        }

        if(r.val<=low || r.val>=hi){
            return false;
        }
        boolean left = validBST(r.left, low, r.val);
        boolean right = validBST(r.right, r.val, hi);

        return left && right;
    }
}