package com.dm.education.hello_world_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageRenderer")
public class StandardOutputMsgRenderer implements MessageRenderer {
    MessageProvider provider;

    @Override
    public void render() {
        System.out.println(getProvider().getMessage());
    }

    public MessageProvider getProvider() {
        return provider;
    }

    @Autowired
    public void setProvider(MessageProvider provider) {
        this.provider = provider;
    }

}
