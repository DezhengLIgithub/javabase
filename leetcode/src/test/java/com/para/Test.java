package com.para;

public class Test {
    public static void main(String[] args) {
        //测试，计算10的阶乘
        long result = fun2(10);
        System.out.println(result);
    }
    public static long fun2(long n) {
        int result = 1;
        for (long i = 1; i<=n; i++) {
            result*=i;
        }
        return result;
    }
//    public static long fun1(long n) {
//        if(n==0 || n == 1) {
//            return 1;
//        }
//        return n*fun1(n);
//    }
}
