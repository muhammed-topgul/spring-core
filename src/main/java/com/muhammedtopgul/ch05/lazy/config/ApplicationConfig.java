package com.muhammedtopgul.ch05.lazy.config;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 16:38
 */

import com.muhammedtopgul.ch05.lazy.domain.BeanC;
import com.muhammedtopgul.ch05.lazy.domain.BeanD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
// @Lazy
public class ApplicationConfig {

    @Bean
    public BeanC beanC(String beanCName, BeanD beanD) {
        return new BeanC(beanCName, beanD);
    }

    @Bean
    public BeanD beanD(String beanDName) {
        return new BeanD(beanDName);
    }

    @Bean
    public String beanCName() {
        return "BEAN-C";
    }

    @Bean
    public String beanDName() {
        return "BEAN-D";
    }
}
