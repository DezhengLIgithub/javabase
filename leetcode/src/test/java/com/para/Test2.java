package com.para;

public class Test2 {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int sum = 0;
        int n = 100;
        for(int i=0; i<=n; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
