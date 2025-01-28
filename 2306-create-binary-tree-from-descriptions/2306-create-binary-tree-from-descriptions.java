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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> children = new HashSet<>();
        Map<Integer, TreeNode> nodeMap = new HashMap<>();
        
        for (int[] description : descriptions) {
            children.add(description[1]);
            nodeMap.putIfAbsent(description[0], new TreeNode(description[0]));
            nodeMap.putIfAbsent(description[1], new TreeNode(description[1]));
        }
        
        TreeNode root = null;
        for (int[] description : descriptions) {
            if (!children.contains(description[0])) {
                root = nodeMap.get(description[0]);
                break;
            }
        }
        
        for (int[] description : descriptions) {
            TreeNode parent = nodeMap.get(description[0]);
            TreeNode child = nodeMap.get(description[1]);
            if (description[2] == 1) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        }
        
        return root;
    }
}