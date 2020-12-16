package com.para.lambda;

public class MyFunctionInterfaceTest {

    public static void main(String[] args) {
        testMethod("   aaaa  ", s -> s.trim());
        testMethod("   aaaa  ", s -> s.trim().toUpperCase());
    }

    public static void testMethod(String str, MyFunctionInterface<String> functionInterface) {
        System.out.println(functionInterface.getValue(str));
    }
}
