package com.selab.wx;

import org.junit.*;
import org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testHello() {
        Assert.assertEquals("Hello World!", new HelloWorld().sayHello());
    }
}
