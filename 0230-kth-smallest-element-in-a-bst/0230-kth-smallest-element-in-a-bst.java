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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> li = inOrderTraversal(root, new ArrayList<>());
        return li.get(k-1);
    }
    public static List<Integer> inOrderTraversal(TreeNode r, List<Integer> l){
        if(r==null){return l;}
        inOrderTraversal(r.left, l);
        l.add(r.val);
        inOrderTraversal(r.right, l);
        return l;
    }
}