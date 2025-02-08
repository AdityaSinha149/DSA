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
    List<TreeNode> treeList;
    public TreeNode balanceBST(TreeNode root) {
        treeList=new ArrayList<>();
        treeToList(root);
        return listToBST(0, treeList.size()-1);
    }

    private void treeToList(TreeNode root){
        if(root.left!=null)treeToList(root.left);
        treeList.add(root);
        if(root.right!=null)treeToList(root.right);
    }

    private TreeNode listToBST(int l,int h){
        if(l>h)return null;
        int m=l+(h-l)/2;
        TreeNode root=treeList.get(m);
        root.left=listToBST(l, m-1);
        root.right=listToBST(m+1, h);
        return root;
    }
}