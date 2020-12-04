package com.para.springlearn.classloader;

public class Class1 {

    public Class1() {
        System.out.println(this.getClass() + "==>" +this.getClass().getClassLoader());
    }
}
