package com.bootcamp.demo;

import com.bootcamp.demo.impl.StringMessageProvider;
import com.bootcamp.demo.impl.MessageProviderType;
import com.bootcamp.demo.interfaces.MessageProvider;

public class MessageProviderFactory {
    public static MessageProvider getMessageProvider(MessageProviderType type) {
        MessageProvider provider = null;
        switch (type) {
            case STRING:
                provider = StringMessageProvider.instance();
                break;
        }
        return provider;
    }
}
