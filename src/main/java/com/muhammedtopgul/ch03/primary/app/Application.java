package com.muhammedtopgul.ch03.primary.app;

/*
 * created by Muhammed Topgul
 * on 09/07/2021
 * at 16:54
 */

import com.muhammedtopgul.ch03.primary.renderer.OutputRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ch03/beans-primary.xml");

        OutputRenderer outputRenderer = (OutputRenderer) applicationContext.getBean("errorOutputRenderer");
        outputRenderer.render();

        outputRenderer = (OutputRenderer) applicationContext.getBean("standardOutputRenderer");
        outputRenderer.render();
    }
}
