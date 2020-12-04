package com.para.springlearn.classloader;

public class Class2 {

    public Class2() {
        System.out.println(this.getClass() + "==>" +this.getClass().getClassLoader());
    }
}
