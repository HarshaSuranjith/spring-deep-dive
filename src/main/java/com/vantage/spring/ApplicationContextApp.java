package com.vantage.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;

import java.util.Arrays;

public class ApplicationContextApp {

    ApplicationContext theContext;

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ApplicationContext context = new StaticApplicationContext();
        context.getApplicationName();
        MessageSource messageSource = (MessageSource) context.getBean("messageSource");
        Probe p = context.getAutowireCapableBeanFactory().createBean(Probe.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        ApplicationContext annotationContext = new AnnotationConfigApplicationContext();
        System.out.println(annotationContext.getApplicationName());
        System.out.println(Arrays.toString(annotationContext.getBeanDefinitionNames()));
    }

}

