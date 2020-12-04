package com.para.springlearn;

public class StaticTest {

    {
        System.out.println("non static");
    }

    static {
        System.out.println("static");
    }

    public StaticTest() {
        System.out.println("constructor...");
    }

    public static void main(String[] args) {
        new StaticTest();
    }
}
