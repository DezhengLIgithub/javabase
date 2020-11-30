package com.para.reference;


import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * -Xms30m -Xmx30m -XX:MaxMetaspaceSzie=30m -XX:UserConcMarkSweepGC -XX:+PrintGCDetails -XX:Compress
 */
public class JVMObject {


    public final static String MAN_TYPE="man";  //常量
    public static String WOMEN_TYPE="woman";    //静态变量

    private HashMap map;

    private PriorityQueue queue;

    public static void main(String[] args) throws InterruptedException {

        Teacher T1 = new Teacher();
        T1.setName("lisa");
        T1.setAge(20);
        T1.setSexType(WOMEN_TYPE);

        for(int i = 0; i<15; i++) {
            System.gc();
        }

        Teacher T2 = new Teacher();
        T2.setName("lilin");
        T2.setAge(25);
        T2.setSexType(MAN_TYPE);

        Thread.sleep(Integer.MAX_VALUE);
    }


}

class Teacher {

    private String name;

    private Integer age;

    private String sexType;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSexType() {
        return sexType;
    }

    public void setSexType(String sexType) {
        this.sexType = sexType;
    }
}


