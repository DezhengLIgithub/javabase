package com.para.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 */
public class RandomAccessFileTest {


    public static void main(String[] args) throws IOException {
//        String s = new String("zhangsan");
//        byte[] bytes = s.getBytes();
//        System.out.println(bytes.length);
//        buildFile();
        readFile();
    }

    private static void buildFile() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("data/employees.txt", "rw");

        Employee e1 = new Employee("zhangsan", 23);
        Employee e2 = new Employee("lisi", 24);
        Employee e3 = new Employee("wangwu", 25);

        randomAccessFile.writeBytes(e1.getName());
        randomAccessFile.writeInt(e1.getAge());
        randomAccessFile.writeInt(e2.getAge());
        randomAccessFile.writeBytes(e2.getName());
        randomAccessFile.writeBytes(e3.getName());
        randomAccessFile.writeInt(e3.getAge());
        randomAccessFile.close();
    }

    private static void readFile() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("data/employees.txt", "r");

        int len = 8;
        randomAccessFile.skipBytes(12);
        System.out.println("第二个员工信息：");
        String str = "";
        System.out.println("age：" + randomAccessFile.readInt());
        for (int i = 0; i < len; i ++) {
            str = str + (char)randomAccessFile.readByte();
        }

        System.out.println("name：" + str);



        System.out.println("第一个员工的信息：");
        randomAccessFile.seek(0);
        str = "";
        for (int i = 0; i < len; i++)
        {
            str = str + (char)randomAccessFile.readByte();
        }
        System.out.println("name：" + str);
        System.out.println("age：" + randomAccessFile.readInt());
        System.out.println("第三个员工的信息：");
        randomAccessFile.skipBytes(12); // 跳过第二个员工的信息
        str = "";
        for (int i = 0; i < len; i++)
        {
            str = str + (char)randomAccessFile.readByte();
        }
        System.out.println("name：" + str.trim());
        System.out.println("age：" + randomAccessFile.readInt());
        randomAccessFile.close();
    }



}
