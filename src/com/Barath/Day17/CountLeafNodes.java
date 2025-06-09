package com.Barath.Day17;
public class CountLeafNodes {

    public static int countLeaves(TreeNode root) {
        if (root == null) return 0;

        // If node is a leaf
        if (root.left == null && root.right == null) return 1;

        // Recur for left and right subtrees
        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int leafCount = countLeaves(root);
        System.out.println("Number of leaf nodes: " + leafCount);  // Output: 3
    }
}

