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
    public void inOrderTraversal(TreeNode root,ArrayList<Integer> array){
        if(root!=null){
            inOrderTraversal(root.left,array);
            array.add(root.val);
            inOrderTraversal(root.right,array);
        }
    }

    public static TreeNode sortedArrayListToBST(ArrayList<Integer> array, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(array.get(mid));
        node.left = sortedArrayListToBST(array, start, mid - 1);
        node.right = sortedArrayListToBST(array, mid + 1, end);
        return node;
    }

    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> array=new ArrayList();
        inOrderTraversal(root,array);
        return sortedArrayListToBST(array,0,array.size()-1);
    }
}