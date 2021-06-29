package com.muhammedtopgul.ch02.beanFactory;

/*
 * created by Muhammed Topgul
 * on 29/06/2021
 * at 23:39
 */

import com.muhammedtopgul.ch02.beanFactory.domain.BeanA;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryExample {
    public static void main(String[] args) {
        getBeanA();
    }

    public static void getBeanA() {
        BeanFactory beanFactory = getBeanFactory();

        // Referencing by id
        BeanA beanA = (BeanA) beanFactory.getBean("beanA");
        System.out.println("beanA: " + beanA);

        // Referencing by name
        beanA = (BeanA) beanFactory.getBean("bean_A");
        System.out.println("bean_A: " + beanA);

        // Referencing by name
        beanA = (BeanA) beanFactory.getBean("bean_a");
        System.out.println("bean_a: " + beanA);

        // Referencing by name
        beanA = (BeanA) beanFactory.getBean("BEAN_A");
        System.out.println("BEAN_A: " + beanA);

        // Referencing by alias
        beanA = (BeanA) beanFactory.getBean("a");
        System.out.println("a: " + beanA);

        // Referencing by alias
        beanA = (BeanA) beanFactory.getBean("aa");
        System.out.println("aa: " + beanA);

        System.out.println("\nAliases of BeanA");
        String[] aliases = beanFactory.getAliases("beanA");
        for (String alias : aliases)
            System.out.println(alias);

        System.out.println();

        boolean b = beanFactory.containsBean("beanA");
        System.out.println("Does BeanFactory contain beanA? " + b);

    }

    private static BeanFactory getBeanFactory() {
        return new ClassPathXmlApplicationContext("ch02/beans.xml");
    }
}
