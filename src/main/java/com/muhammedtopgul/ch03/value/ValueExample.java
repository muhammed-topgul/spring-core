package com.muhammedtopgul.ch03.value;

/*
 * created by Muhammed Topgul
 * on 12/07/2021
 * at 11:39
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ch03/beans-value.xml");

        ValueBean vBean = (ValueBean) applicationContext.getBean("valueBean");
        System.out.println(vBean);

        ABean aBean = (ABean) applicationContext.getBean("aBean");
        System.out.println(aBean);

        System.out.println("\nSystem Properties");
        vBean.getSystemProperties().forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
