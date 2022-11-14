package com.bootcamp.demo.impl;

import org.junit.Before;
import org.junit.Test;

import com.bootcamp.demo.interfaces.MessageProvider;

import static org.mockito.Mockito.*;

public class ConsoleMessageRendererTest {
    private ConsoleMessageRenderer target;

    @Before
    public void setup() {
        target = new ConsoleMessageRenderer();
    }

    @Test
    public void shouldDisplayMessage() {
        MessageProvider mockMessageProvider = mock(MessageProvider.class);
        when(mockMessageProvider.getMessage()).thenReturn("Hello World");

        target.setMessageProvider(mockMessageProvider);
        target.render();

        verify(mockMessageProvider, times(1)).getMessage();
    }
}
