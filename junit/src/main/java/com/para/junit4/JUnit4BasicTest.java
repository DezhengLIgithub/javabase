package com.para.junit4;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

//Junit4的测试类必须继承于TestCase
public class JUnit4BasicTest extends TestCase {


    //JUnit4的测试方法必须以test开头
    public void testArraySort() {

//        Integer[] source = {2,3,5,1,4};
        Integer[] source = {1,2,3,4,5};
        Integer[] target = {1,2,3,4,5};
        Assert.assertArrayEquals(source, target);
    }

}
