package com.para.leetcode.common;

public class BinaryTree<Key extends Comparable<Key>, Value> {

    public Node<Key, Value> root;

    private int N;

    public int size() {
        return N;
    }


    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    public Node put(Node<Key, Value> x, Key key, Value value) {
        if(x == null) {
            N ++;
            return new Node(key, value,  null, null);
        }

        return null;
    }


    //从指定的树x中，查找key对应的值
    public Value get(Key key) {
        return null;
    }

    //删除树中key对应的value
    public Value get(Node x, Key key) {
        return null;
    }




    public void delete(Key key) {

    }


    public Node delete(Node x, Key key) {
        return null;
    }
}
