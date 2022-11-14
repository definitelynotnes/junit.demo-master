package com.bootcamp.demo;

import com.bootcamp.demo.impl.ConsoleMessageRenderer;
import com.bootcamp.demo.impl.MessageRendererType;
import com.bootcamp.demo.interfaces.MessageRenderer;

public class MessageRendererFactory {
    public static MessageRenderer getMessageRenderer(MessageRendererType type) {
        MessageRenderer renderer = null;
        switch (type) {
            case CONSOLE:
                renderer = new ConsoleMessageRenderer();
                break;
        }
        return renderer;
    }
}
