package com.muhammedtopgul.ch03.conditional.app;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 13:48
 */

import com.muhammedtopgul.ch03.conditional.domain.BeanA;
import com.muhammedtopgul.ch03.conditional.domain.BeanC;
import com.muhammedtopgul.ch03.conditional.domain.BeanD;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("ch03/beans-conditional.xml");

//        getBeans1(context);
//		getBeans2(context);
		getBeans3(context);
    }

    public static void getBeans1(ApplicationContext context) {
        BeanA beanA = (BeanA) context.getBean(BeanA.class);
        System.out.println(beanA);
    }

    public static void getBeans2(ApplicationContext context) {
        BeanC beanC = (BeanC) context.getBean(BeanC.class);
        System.out.println(beanC);
    }

    public static void getBeans3(ApplicationContext context) {
//		BeanE beanE = (BeanE) context.getBean("beanE");
//		System.out.println(beanE);
        BeanD beanD = (BeanD) context.getBean("beanD");
        System.out.println(beanD);
    }
}
