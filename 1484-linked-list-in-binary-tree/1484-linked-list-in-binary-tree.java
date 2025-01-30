class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;
        if (helper(head, root)) return true;
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    private boolean helper(ListNode head, TreeNode root) {
        if (head == null) return true;
        else if (root == null || root.val != head.val) return false;
        return helper(head.next, root.left) || helper(head.next, root.right);
    }
}