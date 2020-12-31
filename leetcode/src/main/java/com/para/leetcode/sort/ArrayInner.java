package com.para.leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInner {



    public int[]  retainAll(int[] arr1,int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] == arr2[p2]) {
                list.add(arr1[p1]);
                p1++;
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        int[] result = new int[list.size()];
        int i = 0;
        for (Integer integer : list) {
            result[i++] = integer;
        }
        return result;
    }


    public static char find(char[] chars1, char[] chars2) {
        char[] temp = chars1.length <= chars2.length ? chars1 : chars2;
        char[] temp2 = chars1.length < chars2.length ? chars2 : chars1;
        List<Character> characters = new ArrayList<>();
        for(int i = 0; i < temp.length; i++ ) {
            characters.add(temp[i]);
        }
        for(int i = 0; i < temp2.length; i++) {
            if(!characters.contains(temp2[i])) {
                return temp2[i];
            }
        }
        return (char) -1;
    }
}
