package com.para.reflect;

/**
 * 获取反射中的Class对象
 */
public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException {
        //第一种，使用 Class.forName 静态方法。当你知道该类的全路径名时，你可以使用该方法获取 Class 类对象。
        Class clz = Class.forName("java.lang.String");
        //第二种，使用 .class 方法。
        Class clz1 = String.class;
        //第三种，使用类对象的 getClass() 方法。
        String str = new String("Hello");
        Class clz2 = str.getClass();
    }
}
