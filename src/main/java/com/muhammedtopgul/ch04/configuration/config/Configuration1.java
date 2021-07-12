package com.muhammedtopgul.ch04.configuration.config;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 16:06
 */

import com.muhammedtopgul.ch04.configuration.domain.BeanA;
import com.muhammedtopgul.ch04.configuration.domain.BeanB;
import com.muhammedtopgul.ch04.configuration.domain.BeanC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration
public class Configuration1 {

    public Configuration1() {
        System.out.println("==> Configuration1()");
    }

    @Bean
    public BeanA getBeanA() {
        return new BeanA();
    }

    @Bean
    public BeanB getBeanB(String name, int age) {
        return new BeanB(name, age);
    }

    @Bean
    public BeanC getBeanC() {
        return new BeanC();
    }

    @Bean
    public String name() {
        return "Yasemin";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public String nameOfBean() {
        return "BEAN-C";
    }
}