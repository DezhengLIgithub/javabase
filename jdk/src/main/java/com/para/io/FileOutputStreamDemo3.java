package com.para.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 如何时间数据的换行？
 *  为什么没有换行？因为没有写入换行字符
 *  写入换行符号就可以实现,但是写文本文件打开是可以的，通过windows自带的那个不行，为什么？
 *  因为不同的系统对换行符的识别是不一样的，windows:\r\n  linux:\n mac:\r
 *  而一些高级的记事本软件，是可以识别任意换行符的
 *
 * 如何实现数据的追加写入？
 * 用构造方法FileOutputStream(String name, boolean append)创建输出流
 *
 */
public class FileOutputStreamDemo3 {

    public static void main(String[] args) throws IOException {

        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("data/fos3.txt");

        //写数据
        for (int x = 0; x < 10; x ++) {
            fos.write(("hello " + x).getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();

        //追加写入
        FileOutputStream fos1 = new FileOutputStream("data/fos3.txt", true);
        for (int x = 0; x < 10; x ++) {
            fos1.write(("hello " + x).getBytes());
            fos1.write("\r\n".getBytes());
        }
        fos1.close();

    }
}
