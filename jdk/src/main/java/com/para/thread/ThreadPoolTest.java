package com.para.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Executors.newCachedThreadPool();

        executor.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
