package com.para.leetcode.sort;

public class BubbleSort {

    public static void main(String[] args) {
        Integer[] integers = Integers.rand(10, 50, 250);
//        bubbleSort1(integers);
//        bubbleSort2(integers);
        bubbleSort3(integers);
        for(Integer integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    /**
     * 把第一个元素与第二个元素比较，如果第一个比第二个大，则交换他们的位置。接着继续比较第二个与第三个元素，如果第二个比第三个大，则交换他们的位置….
     * @param integers
     */
    public static void bubbleSort1(Integer[] integers) {
        for(int i = 0;  i < integers.length ; i++) {
            for(int j = 0; j < integers.length - i - 1; j ++) {
                if(integers[j] > integers[j+1]) {
                    int tmp = integers[j];
                    integers[j] = integers[j+1];
                    integers[j+1] = tmp;
                }
            }
        }
    }

    /**
     * 如果数组已经有序
     * @param integers
     */
    public static void bubbleSort2(Integer[] integers) {
        for (int i = 0; i < integers.length; i ++) {
            boolean sorted = true;
            for(int j = 0; j < integers.length - i - 1; j++) {
                if(integers[j] > integers[j + 1]) {
                    int tmp = integers[j];
                    integers[j] = integers[j+1];
                    integers[j+1] = tmp;
                }
            }
            if(sorted) {
                break;
            }
        }
    }

    /**
     * 如果数组后面已经是排序好的
     * @param integers
     */
    public static void bubbleSort3(Integer[] integers) {
        for (int i = 0; i < integers.length; i ++) {
            int sortedIndex = integers.length - 1;
            for (int j = 0 ; j < integers.length - i - 1; j ++) {
                if(integers[j] > integers[j+1]) {
                    int tmp = integers[j];
                    integers[j] = integers[j+1];
                    integers[j+1] = tmp;
                    sortedIndex = j;
                }
            }
            i = sortedIndex;
        }
    }
}
