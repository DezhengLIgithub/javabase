package com.para.junit4;

import org.junit.*;

/**
 *JUnit4中常用注解：
 * @Test                具体的测试用例
 * @BeforeClass         测试类运行前环境准备，一个测试类在运行测试方法之前运行一次
 * @AfterClass          测试类运行后清除环境，一个测试类在运行完所有测试方法后运行一次
 * @Before              每个测试用例运行前运行，有多少个测试用例，就会运行多少次
 * @After               每个测试用例运行后运行，有多少个测试用例，就会运行多少次
 * @Ignore              该测试用例将被忽略
 * @Rule                定义一些规则，如超时时间，异常补货等
 */
public class JUnit4BasicTest2 {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("测试类正在被初始化");
    }

    @Before
    public void before() {
        System.out.println("测试方法正在被初始化");
    }

    //使用注解提供junit测试驱动程序，测试方法名不需要必须以test开头
    @Test
    public void testArraySort() {

//        Integer[] source = {2,3,5,1,4};
        Integer[] source = {1,2,3,4,5};
        Integer[] target = {1,2,3,4,5};
        Assert.assertArrayEquals(source, target);
    }

    @Test
    public void testBool() {
        Assert.assertTrue(true);
    }


    @AfterClass
    public static void endClass() {
        System.out.println("测试类正被释放");
    }

    @After
    public void endTest() {
        System.out.println("测试方法正在被释放");
    }
}
