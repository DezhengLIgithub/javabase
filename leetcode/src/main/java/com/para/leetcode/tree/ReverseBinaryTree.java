package com.para.leetcode.tree;

public class ReverseBinaryTree {

    public BinaryTreeNode invertTree(BinaryTreeNode root) {

        if(root == null) {
            return null;
        }

        invertTree(root.left);
        invertTree(root.right);

        BinaryTreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;

    }
}
