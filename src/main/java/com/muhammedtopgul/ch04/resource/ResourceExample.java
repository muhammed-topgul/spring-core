package com.muhammedtopgul.ch04.resource;

/*
 * created by Muhammed Topgul
 * on 13/07/2021
 * at 14:46
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.muhammedtopgul.ch04.resource")
public class ResourceExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceExample.class);
        getPrinter(context);
    }

    public static void getPrinter(AnnotationConfigApplicationContext context) {
        Printer printer = context.getBean(Printer.class);
        printer.print();
    }
}
