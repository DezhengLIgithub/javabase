package com.para.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CASABA {

    public static void main(String[] args) {
        AtomicInteger atomicInt = new AtomicInteger(100);

        Thread intT1  = new Thread(() -> {
            atomicInt.compareAndSet(100, 101);
            System.out.println("thread intT1-1:" + atomicInt.get());
            atomicInt.compareAndSet(101, 100);
            System.out.println("thread intT2-2:" + atomicInt.get());
        });


        Thread intT2 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            boolean c3 = atomicInt.compareAndSet(100, 101);
            System.out.println("thread intT2:" + atomicInt.get() + ", c3 is " + c3);
        });


        intT1.start();
        intT2.start();
    }




}
