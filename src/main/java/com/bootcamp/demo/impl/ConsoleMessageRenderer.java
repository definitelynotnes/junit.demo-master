package com.bootcamp.demo.impl;

import com.bootcamp.demo.interfaces.MessageProvider;
import com.bootcamp.demo.interfaces.MessageRenderer;

public class ConsoleMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void render() {
        System.out.println("~~ " + messageProvider.getMessage());

    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;

    }

}
