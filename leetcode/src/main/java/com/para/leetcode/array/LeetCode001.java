package com.para.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class LeetCode001 {

    /**
     * 暴力法
     * @param nums
     * @param target
     * @return
     *
     */
    public static int[] twoSum1(int[] nums, int target) {
        for(int i = 0; i< nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                   return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }


    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i ++ ) {
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];

            if(map.containsKey(temp) && map.get(temp) != i) {
                return new int[]{i, map.get(temp)};
            }
        }

        throw new IllegalArgumentException("no two sum solution");
    }


    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp)) {
                return new int[] {map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two sun solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        printNums(twoSum1(nums, target));
        printNums(twoSum2(nums, target));
        printNums(twoSum3(nums, target));

    }
    public static void printNums(int[] nums) {
        for(int i = 0 ; i <nums.length; i ++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }

}
