package com.para.leetcode.tree;


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class LeetCode110 {
    public static boolean isBalanced(TreeNode root) {

        return root == null || isBalanced(root.left) && isBalanced(root.right)
                && (Math.abs(calHeight(root.left) - calHeight(root.right)) <= 1);
    }
    private static int calHeight(TreeNode root) {
        if(root == null) return 0;

        return Math.max(calHeight(root.left), calHeight(root.right)) + 1;
    }
}
