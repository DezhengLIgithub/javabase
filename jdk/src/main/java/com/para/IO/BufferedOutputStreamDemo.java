package com.para.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * BufferOutputStream 实现缓冲的输出流，通过设置这种输出流，应用程序就可以将各个
 * 字节写入底层输出流中，而不必针对每次字节写入调用底层系统
 *
 * 构造方法可以指定缓冲区大小，但是我们一般用不上，因为默认缓冲区大小就足够了
 */
public class BufferedOutputStreamDemo {


    public static void main(String[] args) throws IOException {

        //为什么不传递一个具体的文件或者文件路径，而是传递一个OutputStream对象呢？
        //原因很简单，字节缓冲区流仅仅提供缓冲区，为高效而设计的，但是呢，真正的读写操作还得靠基本的流对象实现
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("data/bos.txt"));

        //写数据
        bufferedOutputStream.write("hello".getBytes());
        bufferedOutputStream.close();
    }
}
