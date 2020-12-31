package com.para.junit4;

import org.junit.Test;

public class TimeoutTest {

    /**
     * 在例子中，infinity() 方法将不会返回，因此JUnit引擎将其标记为失败，并抛出一个异常。
     */
    @Test(timeout = 1000)
    public void infinity() {
        while (true);
    }
}
