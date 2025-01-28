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

    private int transformToGst(TreeNode node, int sum) {
        if (node == null) {
            return sum;
        }
        
        sum = transformToGst(node.right, sum);
        
        sum += node.val;
        node.val = sum;
        
        return transformToGst(node.left, sum);
    }

    public TreeNode bstToGst(TreeNode root) {
        transformToGst(root, 0);
        return root;
    }
}
