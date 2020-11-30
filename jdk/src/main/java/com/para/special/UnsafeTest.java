package com.para.special;

import sun.misc.Unsafe;
import sun.reflect.Reflection;

import java.lang.reflect.Field;

public class UnsafeTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Unsafe unsafe = getUnsafeInstance();
        System.out.println(unsafe.addressSize());
    }


    private static Unsafe getUnsafeInstance() throws NoSuchFieldException, IllegalAccessException {
        Field unsafeStaticField =
                Unsafe.class.getDeclaredField("theUnsafe");
        unsafeStaticField.setAccessible(true);
        return (Unsafe) unsafeStaticField.get(Unsafe.class);
    }
}
