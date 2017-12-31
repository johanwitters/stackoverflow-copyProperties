package com.johanw.stackoverflow.copy;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class TestCopy {
    @Test
    public void test() {
        ClassB b = new ClassB();
        b.b = "Hallo";
        ClassY y = new ClassY();
        try {
            Assert.assertFalse(b.equals(y));
            BeanUtils.copyProperties(b, y);
            Assert.assertTrue(b.equals(y));
        } catch (IllegalAccessException e) {
            Assert.fail(e.toString());
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            Assert.fail(e.toString());
            e.printStackTrace();
        }
    }
}
