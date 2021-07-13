package com.muhammedtopgul.ch05.lazy.domain;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 16:36
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class BeanA {

    private String name;
    private BeanB beanB;

    @Autowired
    public BeanA(String name) {
        System.err.println("in BeanA()");
        this.name = name;
    }

    @Autowired
    public void setBeanB(@Lazy BeanB beanB) {
        this.beanB = beanB;
    }

    @Bean
    public static String name() {
        return "BEAN-A";
    }

    @Override
    public String toString() {
        return "BeanA [name=" + name + ", beanB=" + beanB + "]";
    }
}

