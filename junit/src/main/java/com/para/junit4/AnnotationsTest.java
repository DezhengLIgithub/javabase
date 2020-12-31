package com.para.junit4;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnnotationsTest {

    private ArrayList testList;

    @BeforeClass
    public static void onceExecuteBeforeAll() {
        System.out.println("@BeforeClass: onceExecuteBeforeAll");
    }

    @Before
    public void executeBeforeEach() {
        testList = new ArrayList();
        System.out.println("@Before: executedBeforeEach");
    }

    @AfterClass
    public static void onceExecuteAfterAll() {
        System.out.println("@AfterClass: onceExecutedAfterAll");
    }

    @After
    public void executedAfterEach() {
        testList.clear();
        System.out.println("@After: executedAfterEach");
    }

    @Test
    public void emptyCollection() {
        assertTrue(testList.isEmpty());
        System.out.println("@Test: emptyCollection");
    }

    @Test
    public void oneItemCollection() {
        testList.add("oneItem");
        assertEquals(1, testList.size());
        System.out.println("@Test: OneItemArrayList");
    }

    @Ignore
    public void executionIgnored() {
        System.out.println("@Ignore: This execution is ignored");
    }
}
