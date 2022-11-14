package com.bootcamp.demo;

import com.bootcamp.demo.interfaces.MessageRenderer;

public class Application {
    public static void main(String[] args) {
        ApplicationFactory applicationFactory = ApplicationFactory.instance();
        MessageRenderer consoleMessageRenderer = applicationFactory.getConsoleMessageRenderer();
        consoleMessageRenderer.render();
    }
}
