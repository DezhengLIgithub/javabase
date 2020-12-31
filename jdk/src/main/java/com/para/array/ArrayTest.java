package com.para.array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] ints = new int[10];
        //原始数据类型 数组默认值是0
        for (int i = 0; i < ints.length; i ++) {
            System.out.print(ints[i] + " ");
        }

        System.out.println();

        //引用数据类型数组 默认值是null
        Integer[] integers = new Integer[10];
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + " ");
        }
    }
}
