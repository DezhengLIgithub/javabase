package com.para.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayInputStreamTest {


    public static void main(String[] args) {

        String str = "HelloWorld";
        InputStream inputStream = null;
        try {
            inputStream = new ByteArrayInputStream(str.getBytes());
//        int available = inputStream.available();
            byte[] bytes1 = new byte[1024];
            int len = -1;
            while((len=inputStream.read(bytes1)) != -1) {
                String str1= new String(bytes1, 0, len);
                System.out.println(str1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(inputStream!=null) {
                    //4.释放资源
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
