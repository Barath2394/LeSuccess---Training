package com.Barath.Day17;
import java.util.*;
public class LevelOrderTraversal {
    static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> all = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> currentList = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = q.poll();
                currentList.add(currentNode.val);
                if (currentNode.left != null) {
                    q.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.offer(currentNode.right);
                }
            }
            all.add(new ArrayList<>(currentList));
        }
        return all;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(levelOrder(root));
    }
}
