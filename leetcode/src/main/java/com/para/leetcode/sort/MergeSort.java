package com.para.leetcode.sort;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {9,56, 48, 69, 34, 89, 32, 40};
        merge_sort(arr);
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + "-->");
        }
        System.out.println();
    }

    public static void merge_sort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        int block, start;

        for (block = 1; block < len * 2; block *=2) {
            for(start = 0; start < len; start += 2 * block) {
                int  low = start;
                int mid = (start + block) < len ? (start + block) : len;
                int high = (start + 2 * block) < len ? (start + 2 * block) : len;

                int start1 = low, end1 = mid;
                int start2 = mid, end2 = high;

                while (start1 < end1 && start2 < end2) {
                    result[low++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
                }

                while (start1 < end1) {
                    result[low++] = arr[start1++];
                }
                while (start2 < end2) {
                    result[low++] = arr[start2++];
                }
            }

            int[] temp = arr;
            arr = result;
            result = temp;
        }
//        result = arr;
    }
}
