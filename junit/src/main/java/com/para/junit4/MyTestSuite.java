package com.para.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 套件测试：构建测试集，更加方便的执行测试集
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        JUnit4BasicTest.class,
        JUnit4BasicTest2.class
})
public class MyTestSuite {
}
