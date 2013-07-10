package com.dm.education;

public class HelloWorldMessageProvider implements MessageProvider{

    @Override
    public String getMessage() {
        return "Hello world";
    }
}
