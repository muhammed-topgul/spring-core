package com.muhammedtopgul.ch04.configuration;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 16:11
 */

import com.muhammedtopgul.ch04.configuration.config.Configuration1;
import com.muhammedtopgul.ch04.configuration.domain.BeanA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackageClasses={com.muhammedtopgul.ch04.configuration.config.Configuration1.class})
@Import({com.muhammedtopgul.ch04.configuration.config.Configuration1.class, com.muhammedtopgul.ch04.configuration.config.Configuration2.class, com.muhammedtopgul.ch04.configuration.config.Configuration3.class})
public class ConfigurationExample {
    public static void main(String[] args) {
//		loadConfiguration10();
//		loadConfiguration11();
//		loadConfiguration2();
//		loadConfiguration3();
        checkSingleton();
    }

    private static void checkSingleton() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.muhammedtopgul.ch04.configuration.config");
        BeanA beanA1 = context.getBean(BeanA.class);
        BeanA beanA2 = context.getBean(BeanA.class);
        if(beanA1 == beanA2)
            System.out.println("Singleton");
        else
            System.out.println("Prototype");
    }

    public static void loadConfiguration10() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Configuration1.class); // No need to use @Configuration
        context.refresh();
        BeanA beanA = context.getBean(BeanA.class);
        System.out.println(beanA);
    }

    /**
     * Uses beans.xml
     */
    public static void loadConfiguration11() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch04/beans-configuration.xml");
        BeanA beanA = context.getBean(BeanA.class);
        System.out.println(beanA);
    }

    public static void loadConfiguration2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.muhammedtopgul.ch04.configuration.config");
        BeanA beanA = context.getBean(BeanA.class);
        System.out.println(beanA);
    }

    public static void loadConfiguration3() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationExample.class);
        BeanA beanA = context.getBean(BeanA.class);
        System.out.println(beanA);
    }
}

