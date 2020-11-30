package com.para.leetcode.common;

public class Node<Key,Value> {
    private Key key;

    private Value value;

    private Node<Key,Value> left;

    private Node<Key,Value> right;

    public Node(Key key, Value value, Node left, Node right){
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
