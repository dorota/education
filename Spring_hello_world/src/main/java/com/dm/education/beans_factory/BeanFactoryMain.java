package com.dm.education.beans_factory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class BeanFactoryMain {
    public static void main(String []args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(new FileSystemResource("src/main/resources/xml_bean_factory.xml"));
        Oracle oracle = (Oracle) beanFactory.getBean("oracle");
        System.out.println(oracle.defineMeaningOfLife());
    }
}
