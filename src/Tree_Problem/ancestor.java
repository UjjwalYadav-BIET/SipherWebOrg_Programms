package Tree_Problem;
// Program to find the Lowest Common Ancestor (Nearest Ancestor) in a Binary Tree

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

class Solution {

    // Function to find the lowest common ancestor
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base condition
        if (root == null || root == p || root == q)
            return root;

        // Search in left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both sides return non-null, current node is LCA
        if (left != null && right != null)
            return root;

        // Otherwise return the non-null one
        return (left != null) ? left : right;
    }
}

public class ancestor {
    public static void main(String[] args) {
        // Create binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;
        TreeNode q = root.left.right.right;

        Solution sol = new Solution();
        TreeNode lca = sol.lowestCommonAncestor(root, p, q);

        System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + lca.val);
    }
}
