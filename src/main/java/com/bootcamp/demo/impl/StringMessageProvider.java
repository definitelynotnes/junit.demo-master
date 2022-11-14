package com.bootcamp.demo.impl;

import com.bootcamp.demo.interfaces.MessageProvider;

public class StringMessageProvider implements MessageProvider {
    private static StringMessageProvider INSTANCE;

    private StringMessageProvider() {
    }

    public static StringMessageProvider instance() {
        if (INSTANCE == null) {
            INSTANCE = new StringMessageProvider();
        }
        return INSTANCE;
    }

    @Override
    public String getMessage() {
        return "Hello World";
    }

}
