class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null)
            return false; 
        if (doesPathMatch(head, root)) {
            return true;
        }
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean doesPathMatch(ListNode head, TreeNode root) {
        if (head == null)
            return true;
        if (root == null || head.val != root.val)
            return false;
        return doesPathMatch(head.next, root.left) || doesPathMatch(head.next, root.right);
    }
}
