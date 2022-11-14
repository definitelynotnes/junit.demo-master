package com.bootcamp.demo;

import com.bootcamp.demo.impl.MessageProviderType;
import com.bootcamp.demo.impl.MessageRendererType;
import com.bootcamp.demo.interfaces.MessageProvider;
import com.bootcamp.demo.interfaces.MessageRenderer;

public class ApplicationFactory {
    private static ApplicationFactory INSTANCE;
    
    private ApplicationFactory() {
        
    }
    
    public static ApplicationFactory instance() {
        if(INSTANCE == null) {
            INSTANCE = new ApplicationFactory();
        }
        return INSTANCE;
    }
    
    public MessageRenderer getConsoleMessageRenderer() {
        MessageProvider messageProvider = MessageProviderFactory.getMessageProvider(MessageProviderType.STRING);
        MessageRenderer messageRenderer = MessageRendererFactory.getMessageRenderer(MessageRendererType.CONSOLE);
        messageRenderer.setMessageProvider(messageProvider);
        return messageRenderer;
    }
}
