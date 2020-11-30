package com.para.leetcode.sort;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

public class ArrayMergerSortTask extends RecursiveAction {

    static final int THREHOLD = 1000;
    final  int[] array;
    final int lo, hi;

    ArrayMergerSortTask(int[] array, int lo, int hi) {
        this.array = array;
        this.lo = lo;
        this.hi = hi;
    }


    ArrayMergerSortTask(int[] array) {
        this(array, 0, array.length);
    }

    @Override
    protected void compute() {
        if(hi - lo < THREHOLD) {  //小于1000，就排序
            sortSequentially(lo, hi);
        } else {//大于1000，就差分
            int mid = (lo + hi) >>> 1;
            invokeAll(new ArrayMergerSortTask(array, lo, mid), new ArrayMergerSortTask(array, mid,hi));
            merge(lo, mid, hi);
        }
    }


    void sortSequentially(int lo, int hi) {
        Arrays.sort(array, lo, hi);
    }


    void merge(int lo, int mid, int hi) {
        int[] buf = Arrays.copyOfRange(array, lo ,mid);
        for(int i= 0, j=lo, k= mid; i < buf.length; j++) {
            array[j] = (k == hi || buf[i] < array[k]) ? buf[i++] : array[k++];
        }
    }
}
