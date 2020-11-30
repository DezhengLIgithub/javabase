package com.para.leetcode.hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 217 存在重复元素
 */
public class LeetCode217 {
    public static boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        return set.size() != nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {3,1};
        System.out.println(containsDuplicate(nums));
    }
}
