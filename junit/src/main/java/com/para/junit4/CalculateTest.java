package com.para.junit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * 创建参数化测试
 *  一个测试类也可以被看作是一个参数化测试类？当然，但它要满足下列所有要求：
 * 	该类被注解为 @RunWith(Parameterized.class).
 *  这个类有一个构造函数，存储测试数据。
 * 	这个类有一个静态方法生成并返回测试数据，并注明@Parameters注解。
 * 	这个类有一个测试，它需要注解@Test到方法。
 */
@RunWith(Parameterized.class)
public class CalculateTest {


    private int expected;
    private int first;
    private int second;

    public CalculateTest(int expectedResult, int firstNumber, int secondNumber) {
        this.expected = expectedResult;
        this.first = firstNumber;
        this.second = secondNumber;
    }

    @Parameterized.Parameters
    public static Collection addedNumbers() {
        return Arrays.asList(new Integer[][] { { 3, 1, 2 }, { 5, 2, 3 },
                { 7, 3, 4 }, { 9, 4, 5 }, });
    }

    @Test
    public void sum() {
        Calculate add = new Calculate();
        System.out.println("Addition with parameters : " + first + " and "
                + second);
        assertEquals(expected, add.sum(first, second));
    }

//    Calculate calculate = new Calculate();
//    int sum = calculate.sum(2, 5);
//    int testSum = 7;
//
//    @Test
//    public void testSum() {
//        System.out.println("@Test sum():" + sum + " = " + testSum);
//        assertEquals(sum, testSum);
//    }
}



