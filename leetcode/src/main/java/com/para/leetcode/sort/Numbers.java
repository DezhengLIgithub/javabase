package com.para.leetcode.sort;


import java.util.Arrays;

public class Numbers<T extends Number> {

    public T[] copy(T[] arr) {
        T[] ts = Arrays.copyOf(arr, arr.length);
        return ts;
    }


    public void print(T[] arr) {
        for (int i = 0;; i++) {
            System.out.print(arr[i] + " ");
            if(i == arr.length -1 ) {
                break;
            }
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Numbers<Integer> numbers = new Numbers<>();

        Integer[] integers = Integers.rand(10, 200, 500);

        Integer[] integers1 = numbers.copy(integers);

        integers[0] = 33;
        integers1[0] = 44;
        numbers.print(integers);
        numbers.print(integers1);
    }
}
