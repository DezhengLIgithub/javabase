package com.para.guava;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class CharMatcherTest {


    @Test
    public void testJoiner() {
        Assert.assertEquals(Joiner.on("; ").skipNulls().join("li", null, "de", "zheng"), "li; de; zheng");
        Assert.assertEquals(Joiner.on(",").join(Arrays.asList(1, 5, 7)), "1,5,7");
    }


    @Test
    public void testSplitter() {
//        Iterator<String> iterator = Splitter.on(',').trimResults().omitEmptyStrings().split("foo,bar,,   qux").iterator();
        Iterator<String> iterator = Splitter.on(',').split("foo,bar,,   qux").iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    @Test
    public void testCharMatcher() {
        System.out.println(CharMatcher.whitespace());
    }
}
