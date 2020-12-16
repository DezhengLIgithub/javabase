package com.para.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 *
 * public void write(int b):写一个字节
 * public void write(byte[] b):写一个字节数组
 * public void write(byte[] b, int off, int len): 写一个字节数组的一部分
 */
public class FileOutputStreamDemo2 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data/fos2.txt");

        //调用write方法
        fos.write(57);
        fos.write(58);

        byte[] bytes = {97,98,99,100,101};
        fos.write(bytes);
        fos.write(bytes, 1, 3);

        fos.close();
    }
}
