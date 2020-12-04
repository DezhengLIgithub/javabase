package com.para.springlearn;

public class InitDemo {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstantce();
        System.out.println("counter1: " + singleton.counter1);
        System.out.println("counter2: " + singleton.counter2);
    }
}
