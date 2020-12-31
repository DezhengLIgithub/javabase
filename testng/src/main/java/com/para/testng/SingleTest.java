package com.para.testng;

import org.testng.annotations.Test;

public class SingleTest {

    @Test
    public void runOtherTest1() {
        System.out.println("@Test - runOtherTest1");
    }

    @Test
    public void runOtherTest2() {
        System.out.println("@Test - runOtherTest2");
    }


}
