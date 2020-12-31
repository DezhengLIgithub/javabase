package com.para.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射创建类对象
 */
public class ReflectTest1 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //第一种：通过 Class 对象的 newInstance() 方法。
        Class clz = Apple.class;
        Apple apple = (Apple) clz.newInstance();

        //第二种：通过 Constructor 对象的 newInstance() 方法
        Constructor constructor = clz.getConstructor();
        Apple apple1 = (Apple)constructor.newInstance();

        /**
         * 通过 Constructor 对象创建类对象可以选择特定构造方法，而通过 Class 对象则只能使用默认的无参数构造方法。下面的代码就调用了一个有参数的构造方法进行了类对象的初始化。
         *
         */
        Constructor constructor1 = clz.getConstructor(String.class, int.class);
        Apple apple2 = (Apple)constructor.newInstance("红富士", 15);

    }
}
