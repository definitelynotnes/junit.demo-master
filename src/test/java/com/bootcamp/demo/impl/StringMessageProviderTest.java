package com.bootcamp.demo.impl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringMessageProviderTest {
    private StringMessageProvider target;

    @Before
    public void setup() {
        target = StringMessageProvider.instance();
    }

    @Test
    public void shouldReturnTheSameInstance() {
        StringMessageProvider otherInstance = StringMessageProvider.instance();
        assertTrue(target == otherInstance);
    }

    @Test
    public void shouldReturnMessage() {
        assertEquals("Hello World", target.getMessage());
    }
}
