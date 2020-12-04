package com.para.leetcode.sort;

import java.util.Random;

public class Integers {

    public static Integer[] rand(int count, int min, int max) {
        if(count <= 0) {
            throw new RuntimeException("");
        }
        Integer[] integers = new Integer[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            integers[i] = random.nextInt(max - min) + min;
        }
        return integers;
    }

    public static Integer[] copy(Integer[] integers) {
        Integer[] copyIntegers = integers.clone();
        return copyIntegers;
    }

    public static void print(Integer[] integers) {
        for (int i = 0; i < integers.length; i ++) {
            System.out.print(integers[i] + " ");
        }
        System.out.println();
    }
}
