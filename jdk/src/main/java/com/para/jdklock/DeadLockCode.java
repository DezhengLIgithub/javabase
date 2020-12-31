package com.para.jdklock;

public class DeadLockCode {

    static Object o1 = new Object();
    static Object o2 = new Object();

    public static void main(String[] args) {

        new Thread(() -> {
            synchronized (DeadLockCode.o1){
                System.out.println("thread 1 get o1");
                try {
                    Thread.sleep(100);
                    synchronized (DeadLockCode.o2){
                        System.out.println("thread1 get o2");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        new Thread(() -> {
            synchronized (DeadLockCode.o2){
                System.out.println("thread 2 get o2");
                try {
                    Thread.sleep(100);
                    synchronized (DeadLockCode.o1){
                        System.out.println("thread2 get o1");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
