package com.para.lambda;


@FunctionalInterface
public interface MyFunctionInterface<T> {

    public T getValue(T t);

    //支持默认方法
    default void defaultMethod() {
        System.out.println("this is default method");
    }

    //支持静态方法
    static void staticMethod() {
        System.out.println("this is static method");
    }

    //这是继承Object类的方法
    public boolean equals(Object obj);

}