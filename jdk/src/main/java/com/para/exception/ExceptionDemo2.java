package com.para.exception;

public class ExceptionDemo2 {


    public static void main(String[] args) {
        System.out.println(e1());
    }

    /**
     * 如果catch里面由return语句，请问finally的代码还会执行吗？如果会，请问是在return前还是return后？
     * 会
     * @return
     */
    public static int e1() {
        int a = 10;
        try {
            System.out.println(a/0);
            a = 20;
        } catch (Exception e) {
            a = 30;
            return a;
            /**
             * 执行到这一步的时候，这里不是return a；二是return 30；这个返回路径就形成了;
             * 但hi，他发现后面还有finally，所以继续执行finally的呢日哦那个，a=40
             * 再次回到以前的额返回路径，继续走return 30;
             */
        } finally {
            a = 40;
            System.out.println("finally 代码被执行");
        }
        return a;
    }
}
