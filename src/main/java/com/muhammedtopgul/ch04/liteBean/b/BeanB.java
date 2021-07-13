package com.muhammedtopgul.ch04.liteBean.b;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 13:56
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    private String name;
    private int age;
    private BeanC beanC;

    @Autowired
    public BeanB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Autowired
    public void setBeanC(BeanC beanC) {
        this.beanC = beanC;
    }

    @Bean
    private BeanC beanC() {
        return new BeanC();
    }

    @Bean
    private static String name() {
        return "Muhammed";
    }

    @Bean
    private static int age() {
        return 5;
    }

    @Bean
    private static String nameOfBean() {
        return "Bean-C";
    }

    @Override
    public String toString() {
        return "BeanB [name=" + name + ", age=" + age + ", beanC=" + beanC + "]";
    }
}
