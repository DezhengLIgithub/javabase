package com.para.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 *
 *  输入: "abcabcbb"
 *  输出: 3
 *  解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 2:
 *
 *  输入: "bbbbb"
 *  输出: 1
 *  解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例 3:
 *
 *  输入: "pwwkew"
 *  输出: 3
 *  解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class LeetCode003 {

    /**
     * 方法一：
     * 求不含有重复字符的最长子串的长度
     * 思路：创建一个 pre 数组表示长度，从左到右遍历字符串数组，查看
     *
     * @param s 字符串参数
     * @return int 长度
     */
    public static int lengthOfLongestSubstring1(String s) {
        int[] pre  = new int[128];
        int max = 0, t = 0;
        for(int i = 0 ; i< s.length(); i ++) {
            char c = s.charAt(i);

            if(pre[c] != 0 && pre[c] > t) {
                max = Math.max(max, i -t);
                t = pre[c];
            }
            pre[c] = i + 1;
        }

        return Math.max(max, s.length() - t);
    }


    public static int lengthOfLongestSubstring2(String s) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end< s.length(); end ++) {
            char c = s.charAt(end);
            if(map.containsKey(c)) {
                start = Math.max(map.get(c), start);
            }
            max = Math.max(max, end - start + 1);
            map.put(c, end + 1);
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("abcabcbb"));
        System.out.println(lengthOfLongestSubstring2("abcabcbb"));
    }
}
