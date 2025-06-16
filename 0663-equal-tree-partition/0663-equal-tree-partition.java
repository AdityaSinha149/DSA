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
    public boolean checkEqualTree(TreeNode root) {
        return check(root,root);
    }

    private boolean check(TreeNode parent, TreeNode root){
        if(root==null)return false;
        if(root.left!=null && sum(parent)==2*sum(root.left)) return true;
        if(root.right!=null && sum(parent)==2*sum(root.right)) return true;
        return check(parent,root.left) || check(parent,root.right);
    }

    private int sum(TreeNode root){
        if(root==null)return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
}