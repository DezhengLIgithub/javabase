package com.para.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 需求：往文本文件中输入一句话： hello, io.
 *
 * 分析：
 *  A：这个操作最好是采用字符流来做，但是，字符流是在字节流之后才出现的，所以，今天我们先讲解字节流如何操作
 *  B：由于我们是要往文件中写一句话，所以我们要采用字节输出流
 *
 * 通过上面的分析后，我们要使用OutputStream
 * 但是通过查看API，我们返现该流对象是一个抽象类，不能实例化
 * 所以我们要找一个具体的子类
 *
 * 而我们需要的是哪一个子类呢？ 既然是往文件中写东西 我们应该看看有没有文件输出流相关的子类 发现了FileOutputStream
 *
 * 注意：每种基类的子类以基类名作为后缀名
 *
 * FileOutputStream构造方法：
 * FileOutputStream(File file)
 * FileOutputStream(String name)
 *
 *
 * @see package-info.java
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
//        File file  = new File("fos.txt");
//        FileOutputStream fos = new FileOutputStream(file);

        FileOutputStream fos = new FileOutputStream("data/fos.txt");
        /**
         * 创建字节输出流对象做了几件事：
         * A：调用系统功能去创建文件
         * B：创建fos对象
         * C：把fos对象指向这个文件
         */

        //写数据
        fos.write("Hello, IO".getBytes());
        fos.write("Hello, Java".getBytes());

        /**
         * 释放资源，关闭此文件输出流，并释放与此流有关的所有系统资源
         * A：让流对象变成垃圾，这样就可以被垃圾回收器回收
         * B：通知系统去释放相关的资源
         */
        fos.close();
    }
}
