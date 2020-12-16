package com.para.io;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制文本文件
 * 数据源：从哪里来
 *  a.txt -- 读取数据  --FileInputStream
 *
 * 目的地：到哪里去
 * b.txt -- 写入数据 --FileOutputStream
 */
public class CopyFileDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("data/a.txt");
        FileOutputStream fos = new FileOutputStream("data/b.txt");
        int by = 0;
        while((by = fis.read()) != -1) {
            fos.write(by);
        }

        fos.close();
        fis.close();
    }
}
