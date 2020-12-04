package com.para.springlearn;

public class Singleton {


    private static Singleton mInstance = new Singleton();// 位置1
    public static int counter1;
    public static int counter2 = 0;

//    private static Singleton mInstance = new Singleton();// 位置2

    private Singleton() {
        counter1++;
        counter2++;
    }

    public static Singleton getInstantce() {
        return mInstance;
    }
}
