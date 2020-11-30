package com.para.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 17.电话号码的任意组合
 *
 */
public class LeetCode17 {

    public static final String[] mapper = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    /**
     * 方法一：循环迭代
     * @param digits
     * @return
     */
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return result;
        }
        Integer[] indexes = new Integer[digits.length()];
        for (int i =0; i < digits.length(); i ++) {


        }

        for(int i = 0; i < indexes.length; i++) {
            if(result.size() == 0) {
                for(int j = 0; j < mapper[indexes[i]].length(); j ++) {
                    result.add(String.valueOf(mapper[indexes[i]].charAt(j)));
                }
            } else  {
                List<String> temp = new ArrayList<>();
                for(String pre : result) {
                    for (int j = 0; j < mapper[indexes[i]].length(); j++) {
                        String cs = pre + mapper[indexes[i]].charAt(j);
                        temp.add(cs);
                    }
                }
                result.clear();
                result.addAll(temp);
            }
        }
        return result;
    }

    /**
     * 方法二：树的深度遍历
     */

    public static List<String> letterCombinations1(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return result;
        }
        dfs(digits, 0, result, "");
        return result;
    }

    private static void dfs(String digits, int flag, List<String> result, String joinStr){
        if(digits.length() == flag) {
            result.add(joinStr);
            return;
        }
        String s = mapper[digits.charAt(flag) - '0'];
        for(int i = 0; i<  s.length(); i++) {
            String temp = joinStr + s.charAt(i);
            dfs(digits, flag+1, result, temp);
        }
    }


    public static List<String> letterCombinations2(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if(digits.isEmpty()) {
            return result;
        }
        result.add("");
        while (result.peek().length() != digits.length()) {
            String temp = result.pop();
            String value = mapper[digits.charAt(temp.length()) - '0'];
            for(char c : value .toCharArray()) {
                result.add(temp + c);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String num = "23";
//        List<String> result = letterCombinations(num);
//        List<String> result = letterCombinations1(num);
        List<String> result = letterCombinations2(num);
    }
}
