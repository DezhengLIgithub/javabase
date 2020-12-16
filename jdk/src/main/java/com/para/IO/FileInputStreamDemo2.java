package com.para.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 一次读取一个字节数组
 * int read(byte[] b)返回值是实际读取的字节个数
 */
public class FileInputStreamDemo2 {

    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("data/a.txt");
        //读取数据
        //
        byte[] bytes = new byte[1024];//数组的长度是1024或者1024的整数倍
//
//        int len = fis.read(bytes);
//        System.out.println(len);
        int len = 0;
        while((len = fis.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, len));
        }
        fis.close();
    }
}
