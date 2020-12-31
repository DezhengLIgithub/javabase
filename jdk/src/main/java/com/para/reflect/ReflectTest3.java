package com.para.reflect;

import java.lang.reflect.Field;

/**
 * 通过反射获取类属性、方法、构造器
 */
public class ReflectTest3 {

    public static void main(String[] args) {
        Class clz = Apple.class;
        //我们通过 Class 对象的 getFields() 方法可以获取 Class 类的属性，但无法获取私有属性。

        Field[] fields = clz.getFields();
        for (Field field : fields) {
            System.out.println("非私有属性：" + field.getName());
        }

        //而如果使用 Class 对象的 getDeclaredFields() 方法则可以获取包括私有属性在内的所有属性：
        Field[] declaredFields = clz.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("所有属性：" + field.getName());
        }

        /**
         * 与获取类属性一样，当我们去获取类方法、类构造器时，如果要获取私有方法或私有构造器，则必须使用有 declared 关键字的方法。
         */

    }
}
