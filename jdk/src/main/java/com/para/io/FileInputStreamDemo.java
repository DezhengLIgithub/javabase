package com.para.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节输入流操作步骤：
 * A：创建字节输入流对象
 * B：调用read()方法读取数据，并把数据显示在控制台
 * C：释放资源
 *
 * 读取数据的方式：
 * A：int read():一次读取一个字节
 * B：int read(byte[] b):一次读取一个字节数组
 */

public class FileInputStreamDemo {


    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("data/fis.txt");

//        int by = fis.read();
//        System.out.println(by);
//        System.out.println((char)by);
//
//        by = fis.read();
//        System.out.println(by);
//        System.out.println((char)by);
//
//        by = fis.read();
//        System.out.println(by);
//        System.out.println((char)by);

//        int by = fis.read();
//        while (by != -1) {
//            System.out.println((char)by);
//            by = fis.read();
//        }
        int by = -1;
        while ((by = fis.read()) != -1) {
            System.out.println((char) by);
        }
        fis.close();
    }
}
