package com.para.threadlocal;

public class TreadLocalTest {


    protected static class TestThread implements Runnable {

        private ThreadLocal<Integer> intThreadLocal = new ThreadLocal<>();

        @Override
        public void run() {

        }
    }
    public static void main(String[] args) {

    }
}
