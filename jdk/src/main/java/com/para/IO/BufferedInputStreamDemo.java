package com.para.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {


    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data/bos.txt"));

//        int  by = 0;
//        while ((by = bis.read()) != -1) {
//            System.out.println((char)by);
//        }

        byte[] bytes = new byte[1024];
        int len = 0;

        while ((len = bis.read()) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        bis.close();
    }
}
