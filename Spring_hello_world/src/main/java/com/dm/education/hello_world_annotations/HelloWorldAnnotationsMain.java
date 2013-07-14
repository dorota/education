package com.dm.education.hello_world_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldAnnotationsMain {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotations-spring-config.xml");
        MessageRenderer renderer = (MessageRenderer) applicationContext.getBean("messageRenderer");
        renderer.render();
    }
}
