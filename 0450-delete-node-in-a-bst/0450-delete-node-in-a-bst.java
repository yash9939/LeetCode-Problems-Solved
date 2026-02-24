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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            if(root.val == key){
                return null;
            }
            return root;
        }

        List<Integer> li = inOrder(root, new ArrayList<>());

        li.remove(Integer.valueOf(key));

        int middle = li.size()/2;
        TreeNode newRoot = new TreeNode(li.get(middle));
        for(int i = 0; i<li.size(); i++){
            if(li.get(i)!=li.get(middle)){
                insertIntoBST(newRoot, li.get(i));
            }
        } 

        return newRoot;
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

    public TreeNode insertIntoBST(TreeNode r, int val){
        if(r==null){
            return new TreeNode(val);
        }

        if(r.val>val){
            r.left = insertIntoBST(r.left, val);
        }
        else{
            r.right = insertIntoBST(r.right, val);
        }

        return r;
    }
}