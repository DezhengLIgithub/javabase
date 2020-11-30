package com.para.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

public class ABASolver {

    public static void main(String[] args) {
        AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<Integer>(100, 0);

        Thread refT1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                atomicStampedReference.compareAndSet(100, 101, atomicStampedReference.getStamp(), atomicStampedReference.getStamp()+1);
                System.out.println("thread refT1:" + atomicStampedReference.getReference());

                atomicStampedReference.compareAndSet(101, 100, atomicStampedReference.getStamp(), atomicStampedReference.getStamp()+1);
                System.out.println("thread refT1:" + atomicStampedReference.getReference());
            }
        });


        Thread refT2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int stamp = atomicStampedReference.getStamp();
                System.out.println("before sleep : stamp = " + stamp);    // stamp = 0
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("after sleep : stamp = " + atomicStampedReference.getStamp());//stamp = 1
                boolean c3 = atomicStampedReference.compareAndSet(100, 101, stamp, stamp + 1);
                System.out.println("thread refT2:" + atomicStampedReference.getReference() + ",c3 is " + c3);
            }
        });

        refT1.start();
        refT2.start();
    }
}
