package com.para.leetcode.sort;

public abstract class Sort<T extends Number> implements Comparable<Sort>{

    protected T[] arr;

    private long time;

    public void sort(T[] arr) {
        this.arr = arr;
        sort();
    }

    public abstract void sort();

    @Override
    public int compareTo(Sort o) {
        return (int) (this.time - o.time);
    }

}
