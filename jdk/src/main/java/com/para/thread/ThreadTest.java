package com.para.thread;

public class ThreadTest {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread-1");
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread-2");
            }
        });


        System.out.println(thread1.getThreadGroup());
        System.out.println(thread2.getThreadGroup());


    }
}
