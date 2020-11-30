package com.para.leetcode.string;

import java.util.Stack;

public class LeetCode020 {

    public static boolean isValid(String s) {
        Stack<Character> sk=new Stack();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!sk.isEmpty()){
                if( (c==')'&&sk.peek()!='(')||
                        (c==']'&&sk.peek()!='[')||
                        (c=='}'&&sk.peek()!='{') )
                    return false;
                else if(c=='('||c=='{'||c=='[')
                    sk.push(c);
                else
                    sk.pop();
            }
            else
                sk.push(c);
        }
        return sk.isEmpty();
    }

}
