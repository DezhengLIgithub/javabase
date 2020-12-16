package com.para.io;

import java.util.Arrays;

/**
 * 计算机如何识别什么时候把两个字节转换为中文呢？
 *
 * 在计算机中中文的存储分两个字节：
 *  第一个字节肯定是负数
 *  第二个字节常见的是负数，可能是正数，但是没影响
 */
public class StringDemo {

    public static void main(String[] args) {
//        String s = "abcde";
//
//        byte[] bytes = s.getBytes();
//
//        System.out.println(Arrays.toString(bytes));//[97, 98, 99, 100, 101]
//

        String s = "我爱你中国";

        byte[] bytes = s.getBytes();

        System.out.println(Arrays.toString(bytes));//[-26, -120, -111, -25, -120, -79, -28, -67, -96, -28, -72, -83, -27, -101, -67]

    }
}
