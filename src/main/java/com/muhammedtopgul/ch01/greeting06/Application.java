package com.muhammedtopgul.ch01.greeting06;

/*
 * created by Muhammed Topgul
 * on 27/06/2021
 * at 14:32
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("ch01/beans.xml");

        GreetingRenderer renderer = (GreetingRenderer) factory.getBean("renderer");
        renderer.render();

    }
}
