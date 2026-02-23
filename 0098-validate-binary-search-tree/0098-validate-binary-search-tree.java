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
        if(root.left == null && root.right == null){
            return true;
        }

        List<Integer> order = inOrder(root, new ArrayList<>());

        for(int i = 0; i<order.size()-1; i++){
            if(order.get(i) > order.get(i+1)){
                return false;
            }
        }

        return true;
    }

    public List<Integer> inOrder(TreeNode r, List<Integer> l){
        if(r==null){
            return l;
        }

        inOrder(r.left, l);
        l.add(r.val);
        inOrder(r.right, l);
        return l;
    }
}