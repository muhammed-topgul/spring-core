package com.muhammedtopgul.ch04.configuration;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 16:10
 */

import com.muhammedtopgul.ch04.configuration.domain.BeanD;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses={com.muhammedtopgul.ch04.configuration.config.Configuration4.class})
public class SelectionExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SelectionExample.class);
        BeanD beanD = context.getBean(BeanD.class);
        System.out.println(beanD);
    }
}
