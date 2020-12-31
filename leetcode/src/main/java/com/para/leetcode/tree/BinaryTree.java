package com.para.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {

    public List<T> proOrder(BinaryTreeNode<T> treeNode) {
        List<T> list = new ArrayList<>();
        list.add(treeNode.val);
        if (treeNode.left != null) {
            proOrder(treeNode.left);
        }
        if (treeNode.right != null) {
            proOrder(treeNode.right);
        }
        return list;
    }

    public List<T> postOrder(BinaryTreeNode<T> treeNode) {
        List<T> list = new ArrayList<>();

        if (treeNode.left != null) {
            proOrder(treeNode.left);
        }
        list.add(treeNode.val);
        if (treeNode.right != null) {
            proOrder(treeNode.right);
        }
        return list;
    }

    public List<T> backOrder(BinaryTreeNode<T> treeNode) {
        List<T> list = new ArrayList<>();
        if (treeNode.left != null) {
            proOrder(treeNode.left);
        }
        if (treeNode.right != null) {
            proOrder(treeNode.right);
        }
        list.add(treeNode.val);
        return list;
    }


    public BinaryTreeNode<T>  addNode(BinaryTreeNode<T> parentNode, T data, boolean isLeft) {
        if(parentNode==null)
            throw new RuntimeException("父节点为空，无法添加子节点");
        if (isLeft&&parentNode.left!=null)
            throw new RuntimeException("左子节点已经存在，添加失败");
        if(!isLeft&&parentNode.right!=null)
            throw new RuntimeException("右子节点已经存在，添加失败");

        BinaryTreeNode newNode=new BinaryTreeNode(data);
        if(isLeft) {
            parentNode.left=newNode;
        }else {
            parentNode.right=newNode;
        }
        return newNode;

    }

    public static void main(String[] args) {

    }
}


class BinaryTreeNode<T> {
    T val;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(T x) {
        val = x;
    }


}
