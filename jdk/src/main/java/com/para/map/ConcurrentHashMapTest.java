package com.para.map;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        ConcurrentHashMap<String, String> chm1  = new ConcurrentHashMap<>();
        Class clazz = chm1.getClass();
        Field field = clazz.getDeclaredField("SIZECTL");
        field.setAccessible(true);
        long vale = (long) field.get(chm1);
        Field[] fields = chm1.getClass().getDeclaredFields();


        ConcurrentHashMap<String, String> chm2 = new ConcurrentHashMap<>(32);

        for(int i=0;i<20;i++) {
            chm2.put("key"+i, "value" + i);

        }
        int x = 1 << 30;

        System.out.println(x);
        System.out.println(x >>> 1);
        System.out.println(x/1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println((Integer.MAX_VALUE-8)%2);
    }
}
