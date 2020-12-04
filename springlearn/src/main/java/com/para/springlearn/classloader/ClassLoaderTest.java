package com.para.springlearn.classloader;

public class ClassLoaderTest {

    public static void main(String[] args) {
        new Class1();
        new Class2();
        System.out.println(ClassLoaderTest.class + "==>" + ClassLoaderTest.class.getClassLoader());
    }
}
