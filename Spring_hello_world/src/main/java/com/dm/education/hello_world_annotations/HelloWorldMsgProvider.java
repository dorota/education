package com.dm.education.hello_world_annotations;

import org.springframework.stereotype.Service;

@Service("messageProvider")
public class HelloWorldMsgProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Hello World";
    }
}
