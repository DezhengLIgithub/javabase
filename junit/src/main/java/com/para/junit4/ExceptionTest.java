package com.para.junit4;

import org.junit.Test;

public class ExceptionTest {

    /**
     * 在例子中，divisionWithException()方法将抛出ArithmeticException异常，因为这是一个预期的异常，因此单元测试会通过。
     */
    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1/0;
    }
}
