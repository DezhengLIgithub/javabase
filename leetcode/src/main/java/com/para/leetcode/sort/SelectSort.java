package com.para.leetcode.sort;

public class SelectSort {
    public static void main(String[] args) {
        Integer[] integers = Integers.rand(10, 100, 500);
        selectSort(integers);
        Integers.print(integers);

    }

    public static void selectSort(Integer[] integers) {
        for(int i = integers.length - 1; i > 0; i --) {
            int maxIndex = 0;
            for(int j = 1; j <= i; j ++) {
                if(integers[maxIndex] < integers[j]) {
                    maxIndex = j;
                }
            }
            int tmp = integers[maxIndex];
            integers[maxIndex] = integers[i];
            integers[i] = tmp;
        }
    }
}
